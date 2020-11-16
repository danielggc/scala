import java.time.Duration
import java.util.UUID
import slick.jdbc.SQLiteProfile.api._
import javax.inject.Inject
import javax.swing.text.html.Option
import play.api.db.slick.{databaseConfigProvider,HasDatabaseConfigProvider}
import play.api.mvc.{AbstractController,ControllerComponents}
import scala.concurrent.{ExecutionContext,Future}
case  class Movie(
  id:Option[String]=Option(UUID.randomUUID().toString),
  title:String,
  year:Int,
  cover:String,
  description:String,
  duration:Int,
  contentratina:String,
  source:String,
  tags:Option[String]

                 )

class movieTable(tag:Tag) extends Table[Movie](tag,_tablename="movie"){
  def id:Rep[String]=column[String]("id",o.PrimaryKey)
  def title:Rep[String]=column[String]("title")
  def year:Rep[Int]=column[Int]("year")
  def cover:Rep[String]=column[String]("cover")
  def description:Rep[String]=column[String]("description")
  def duration:Rep[Int]=column[Int]("duration")
  def contentRating:Rep[String]=column[String]("contentRating")
  def sourse:Rep[String]=column[String]("sourse")
  def tags:Rep[Option[String]]=column[Option[String]]("tags",O.Length(2000,varying = true))
  def *:ProvenShape[Movie]= (id.?,title,year,cover,description,duration,contentRating,sourse,tags)
}

class MovieRepository @Inject()(

)



