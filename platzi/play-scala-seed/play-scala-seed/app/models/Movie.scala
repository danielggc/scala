
package models

import java.util.UUID
import javax.inject.Inject

import slick.jdbc.SQLiteProfile.api._
import play.api.db.slick.{dataBaseConfigProvider,HasDatabaseConfigProvider}
import play.api.mvc.{AbstractController,ControllerComponents}
import scala.concurrent.{ExecutionContext, Future}


/*
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

class movieTable(tag:Tag) extends Table[Movie](tag , _tableName = "movie"){
  def id: Rep[String] = column[String]("id",o.PrimaryKey)
  def title: Rep[String] = column[String]("title")
  def year: Rep[Int] = column[Int]("year")
  def cover: Rep[String] = column[String]("cover")
  def description: Rep[String] = column[String]("description")
  def duration: Rep[Int] = column[Int]("duration")
  def contentRating: Rep[String] = column[String]("contentRating")
  def sourse: Rep[String] = column[String]("sourse")
  def tags: Rep[Option[String]] = column[Option[String]]("tags",O.Length(2000,varying = true))
  //def *: ProvenShape[Movie] =
  //(id.?,title,year,cover,description,duration,contentRating,sourse,tags) <> (Movie.tupled,Movie.unapply)
}

class MovieRepository @Inject()(
  protected  val dbConfigProvider:DatabaseConfigProvider,cc:ControllerComponents)
  (implicit ec:ExecutionContext)extends AbstractController(cc)
  with HasdatabaseConfigProvider[JdbcProfile]{
    private lazy val movieQuery = TableQuery[MovieTable]
}

*/
