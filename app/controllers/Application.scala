package controllers

import play.api._
import play.api.mvc._

import scalax.file.{FileSystem, Path}

object Application extends Controller {
  
  def index = Action {
    println("Got request!")
    Ok(views.html.index(FileSystem.default.roots.head))
  }
  
}
