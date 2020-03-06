package controllers
import javax.inject._
import play.api.mvc._


import models.es_search_form._
import play.api.data.Form

import models.es_search


@Singleton
class SearchController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  private val post_search_Url = routes.SearchController.searchWidget()
  var search_input = "testing search INput"
  var search_output = "testing search OUTput"

  def searchWidget = Action { implicit request: MessagesRequest[AnyContent] =>
    val failFunction = {formWithErrors: Form[Pesquisa] =>
      Ok("sorry, fail to research")
    }

    val successFunction = { search_data: Pesquisa =>
      val string_to_search = Pesquisa(search_input = search_data.search_input)
      search_input = string_to_search.search_input

      // Perform elastic search query
      search_output = es_search.perform_search(search_input)

    }

    val formValidationResult = search_form.bindFromRequest
    formValidationResult.fold(failFunction, successFunction)

    Ok(views.html.search(search_input, search_output, search_form, post_search_Url))
  }
}
