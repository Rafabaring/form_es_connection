
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[List],Form[WidgetForm.Dados],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(widgets_inicial: Seq[List], form: Form[WidgetForm.Dados], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!--(implicit request: MessagesRequestHeader) used for HTTP requests-->

    """),_display_(/*4.6*/main("Widgets")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""

        """),format.raw/*6.9*/("""<h1>Widgets</h1>


        <table>
            <thead>
            <tr><th>Name</th><th>Price</th>
            </thead>
            <tbody>
            """),_display_(/*14.14*/for(w <- widgets_inicial) yield /*14.39*/ {_display_(Seq[Any](format.raw/*14.41*/("""
            """),format.raw/*15.13*/("""<tr><td>"""),_display_(/*15.22*/w/*15.23*/.name),format.raw/*15.28*/("""</td><td>"""),_display_(/*15.38*/w/*15.39*/.price),format.raw/*15.45*/("""</td><td>"""),_display_(/*15.55*/w/*15.56*/.size),format.raw/*15.61*/("""</td></tr>
            """)))}),format.raw/*16.14*/("""
            """),format.raw/*17.13*/("""</tbody>
        </table>



        """),_display_(/*22.10*/helper/*22.16*/.form(postUrl)/*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
        """),_display_(/*23.10*/helper/*23.16*/.CSRF.formField),format.raw/*23.31*/("""
        """),_display_(/*24.10*/helper/*24.16*/.inputText(form("nAme"))),format.raw/*24.40*/("""
        """),_display_(/*25.10*/helper/*25.16*/.inputText(form("pRice"))),format.raw/*25.41*/("""
        """),_display_(/*26.10*/helper/*26.16*/.inputText(form("sIze"))),format.raw/*26.40*/("""
        """),format.raw/*27.9*/("""<button>Create widDDget</button>
        """)))}),format.raw/*28.10*/("""
    """)))}),format.raw/*29.6*/("""

"""))
      }
    }
  }

  def render(widgets_inicial:Seq[List],form:Form[WidgetForm.Dados],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(widgets_inicial,form,postUrl)(request)

  def f:((Seq[List],Form[WidgetForm.Dados],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (widgets_inicial,form,postUrl) => (request) => apply(widgets_inicial,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-03T08:08:56.431
                  SOURCE: /Users/rafa/Documents/Baring_Git/form_es_connection/app/views/listWidgets.scala.html
                  HASH: e212a59244d7cc027dbb2cda47418f204d8b61df
                  MATRIX: 788->1|996->116|1099->194|1122->209|1161->211|1197->221|1377->374|1418->399|1458->401|1499->414|1535->423|1545->424|1571->429|1608->439|1618->440|1645->446|1682->456|1692->457|1718->462|1773->486|1814->499|1879->537|1894->543|1917->557|1957->559|1994->569|2009->575|2045->590|2082->600|2097->606|2142->630|2179->640|2194->646|2240->671|2277->681|2292->687|2337->711|2373->720|2446->762|2482->768
                  LINES: 21->1|26->2|28->4|28->4|28->4|30->6|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|46->22|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|52->28|53->29
                  -- GENERATED --
              */
          