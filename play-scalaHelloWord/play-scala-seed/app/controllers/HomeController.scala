package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import models.MovieRepository
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class HomeController @Inject()(cc: ControllerComponents,movieRepository: MovieRepository)
  extends AbstractController(cc) {


  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def dbInit() = Action.async { request =>
    movieRepository.dbInit
      .map(_ => Created("Tabla creada comom te quedo el ojo morado ¡¡¡¡ =)"))
      .recover { ex =>
        play.Logger.of("dbInit").debug("Error en dbInit", ex)
        InternalServerError(s"Hubo un error")
      }
  }
}

