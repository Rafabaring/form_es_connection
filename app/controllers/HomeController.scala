package controllers

import apple.laf.JRSUIConstants.Widget
import io.searchbox.core.{Delete, Index}
import io.searchbox.indices.CreateIndex
import javax.inject._
import play.api._
import play.api.mvc._

import scala.collection.mutable
import models.List
import models.WidgetForm._
import play.api.data.Form
import play.api.libs.json.Json
import models.es_add_doc
import models.es_build_client


@Singleton
class HomeController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }



  // ####################################################
  // ### Creating and listing first widget
  // ####################################################

  private val widgets_initial = mutable.ArrayBuffer(
    List("Widget 1", 123, 55),
    List("Widget 2", 456, 66),
    List("Widget 3", 789, 77)
  )

  def listWidgets = Action {implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.listWidgets(widgets_initial.toSeq, form, postUrl))
  }





  // ####################################################
  // ### Updating the widget + adding the doc the ES
  // ####################################################
  private val postUrl = routes.HomeController.createWidget()

  def createWidget = Action { implicit request: MessagesRequest[AnyContent] =>
    val failFunction = { formWithErrors: Form[Dados] =>
      Ok(views.html.listWidgets(widgets_initial.toSeq, formWithErrors, postUrl))
    }

    val successFunction = { data: Dados =>
      val widget = List(name = data.name, price = data.price, size = data.size)
      widgets_initial += widget
    }

    val formValidationResult = form.bindFromRequest
    formValidationResult.fold(failFunction, successFunction)


    println(widgets_initial) // not necessary - to help debug

    val recently_added_name = widgets_initial(widgets_initial.length - 1).name
    val recently_added_price = widgets_initial(widgets_initial.length - 1).price
    val recently_added_size = widgets_initial(widgets_initial.length - 1).size

    // Adding document to ES index
    es_add_doc.add_doc(recently_added_name, recently_added_price, recently_added_size)

    Ok(views.html.listWidgets(widgets_initial.toSeq, form, postUrl))
  }




  // ####################################################
  // ### Creating and deleting indexes
  // ####################################################

  def delete_index(index_name: String) = Action { implicit request: Request[AnyContent] =>
    val client = es_build_client.buildFactory()
    client.execute(new Delete.Builder(index_name).build())
    Ok(views.html.deleteIndex(index_name))
  }

  def create_index(index_name: String) = Action { implicit request: Request[AnyContent] =>
    val client = es_build_client.buildFactory()
    client.execute(new CreateIndex.Builder(index_name).build())
    Ok(views.html.createIndex(index_name))
  }






  }
