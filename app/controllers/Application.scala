package controllers

import play.api._
import play.api.libs.json.{JsValue, Json}
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def users = Action {
   val json: JsValue = Json.parse(
     """{
         "user": {
           "name" : "Kenneth",
           "age" : 26
          }
       }
     """)
   Ok(json)
  }

}