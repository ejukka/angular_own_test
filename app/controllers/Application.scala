package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("test"))
  }

  def shopping = Action {
    Ok(views.html.shopping.shopping("test"))
  }

  def dragMe = Action {
    Ok(views.html.shopping.index("test"))
  }

  def hello = Action {
    Ok(views.html.shopping.hello("asdf"))
  }
  
   def blog = Action {
    Ok(views.html.main.apply)
  }

}