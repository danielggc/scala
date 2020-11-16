package controllers

import javax.inject._
import models.{Movie, MovieRepository}
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class MovieController @Inject()(
  cc:ControllerComponents,
  movieRepository: MovieRepository)
  extends AbstractController(cc){

    implicit  val serializador =Json.format[Movie]
    val logger = play.Logger.of("MovieController")

    def getMovies = Action.async {
      movieRepository.getAll
        .map(movies => {
          val j = Json.obj(
            "data" -> movies,
            "message" -> "Movies listed"
          )
          Ok(j)
        })
        .recover {
          case ex =>
            logger.error("Falló en getMovies", ex)
            InternalServerError(s"Hubo un error: ${ex.getLocalizedMessage}")
        }
    }

    def getMovie(id:String)=Action.async{
      movieRepository.getOne(id).map(movie => {
        val j=Json.obj("data"->movie, "message" -> "Get Movie")
        Ok(j)
      }).recover {
        case ex =>
          logger.error("fallo en getMoovie", ex)
          InternalServerError(s" Hubo un error: ${ex.getLocalizedMessage}")
      }
    }
    def createMovie=Action.async(parse.json){
      request => val validador = request.body.validate[Movie]
      validador.asEither match {
        case Left(error)=> Future.successful(BadRequest(error.toString()))
        case Right(movie)=>{
          movieRepository.create(movie).map(movie => {
            val j=Json.obj("data"->movie, "message" -> "Movie crate")
            Ok(j)
          }).recover {
            case ex =>
              logger.error("fallo en crateMovie", ex)
              InternalServerError(s" Hubo un error: ${ex.getLocalizedMessage}")
          }
        }
      }
    }
    def updateMovie(id:String)=Action.async(parse.json){ request =>
        val validador = request.body.validate[Movie]
        validador.asEither match {
          case Left(error) => Future.successful(BadRequest(error.toString()))
          case Right(movie) =>{
            movieRepository.update(id,movie).map(movie => {
              val j=Json.obj("data"->movie, "message" -> "Movie update")
              Ok(j)
            }).recover {
              case ex =>
                logger.error("fallo en updateMovie", ex)
                InternalServerError(s" Hubo un error: ${ex.getLocalizedMessage}")
            }
          }
        }
    }
    def deleteMovie(id:String)=Action.async{
      movieRepository.delete(id).map(movie => {
        val j=Json.obj("data"->movie,"message" -> "Movie  delete")
        Ok(j)
      }).recover {
        case ex =>
          logger.error("fallo en deleteMovie", ex)
          InternalServerError(s" Hubo un error: ${ex.getLocalizedMessage}")
      }
    }

}
