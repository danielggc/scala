
package models
import java.util.UUID

import slick.jdbc.SQLiteProfile.api._
import javax.inject.Inject
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.mvc.{AbstractController, ControllerComponents}
import slick.driver.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}


case  class Movie(
                   id:Option[String]=Option(UUID.randomUUID.toString),
                   title:String,
                   year:Int,
                   cover:String,
                   description:String,
                   duration:Int,
                   contentRating:String,
                   source:String,
                   tags:Option[String]

                 )

class MovieTable(tag:Tag) extends Table[Movie](tag , _tableName = "movie"){
  def id        = column[String]("id", O.PrimaryKey)
  def title        = column[String]("title")
  def year            = column[Int]("year")
  def cover        = column[String]("cover")
  def description  = column[String]("description")
  def duration        = column[Int]("duration")
  def contentRating= column[String]("contentRating")
  def source       = column[String]("source")
  def tags = column[Option[String]]("tags", O.Length(2000, varying = true))
  def * =
    (id.?, title, year, cover, description, duration, contentRating, source, tags) <> (Movie.tupled,Movie.unapply)
}

class MovieRepository @Inject()
(protected  val dbConfigProvider:DatabaseConfigProvider,cc:ControllerComponents)
  (implicit ec:ExecutionContext)extends AbstractController(cc)
  with HasDatabaseConfigProvider[JdbcProfile]{
    private lazy val movieQuery = TableQuery[MovieTable]

  def dbInit:Future[Unit]={
    val createeSchema= movieQuery.schema.createIfNotExists
    db.run(createeSchema)
  }
  def getAll={
    val q=movieQuery.sortBy(_.id)
    db.run(q.result )
  }
  def getOne(dato:String)={
    val q = movieQuery.filter(x => x.id===dato)
    db.run(q.result.headOption)
  }
  def create(video : Movie)={
    val insert =movieQuery += video
    db.run(insert).flatMap(x  => getOne(video.id.getOrElse("")))
  }
  def update(id:String,movie:Movie)={
    val q= movieQuery.filter(_.id===movie.id && movie.id.contains(id))
    val update=q.update(movie)
    db.run(update).flatMap(_ => db.run(q.result.headOption))
  }
  def delete(id:String)={
    val q =movieQuery.filter(_.id=== id)
    for{
      objeto <- db.run(q.result.headOption)
      _ <- db.run(q.delete)
    }yield objeto

  }
}

