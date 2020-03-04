package models

object WidgetForm {
  import play.api.data.Forms._
  import play.api.data.Form


  case class Dados(name: String, price: Int, size: Int)



  val form = Form(
    mapping(
      "nAme" -> nonEmptyText,
      "pRice" -> number(min = 0),
      "sIze" -> number(min = 0)
    )(Dados.apply)(Dados.unapply)
  )
}
