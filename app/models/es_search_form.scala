package models

object es_search_form {
  import play.api.data.Forms._
  import play.api.data.Form


  case class Pesquisa(search_input: String)



  val search_form = Form(
    mapping(
      "seArch_input" -> nonEmptyText
    )(Pesquisa.apply)(Pesquisa.unapply)
  )
}
