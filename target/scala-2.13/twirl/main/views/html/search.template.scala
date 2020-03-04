
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,Form[es_search_form.Pesquisa],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(search_input: String, search_output: String, form: Form[es_search_form.Pesquisa], post_search_Url: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!--(implicit request: MessagesRequestHeader) used for HTTP requests-->

    """),_display_(/*4.6*/main("Widgets")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""

        """),format.raw/*6.9*/("""<h1>Widgets</h1>


        <table>
            <thead>
            <tr><th>Behold! the result of your search</th>

            </thead>
            <tbody>


            </tbody>
        </table>


        <p>search input</p>
        <td>"""),_display_(/*22.14*/search_input),format.raw/*22.26*/("""</td>
        <p>your response</p>
        <td>"""),_display_(/*24.14*/search_output),format.raw/*24.27*/("""</td>

        """),_display_(/*26.10*/helper/*26.16*/.form(post_search_Url)/*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""
        """),_display_(/*27.10*/helper/*27.16*/.CSRF.formField),format.raw/*27.31*/("""
        """),_display_(/*28.10*/helper/*28.16*/.inputText(form("seArch_input"))),format.raw/*28.48*/("""
        """),format.raw/*29.9*/("""<button>Search</button>
        """)))}),format.raw/*30.10*/("""
    """)))}))
      }
    }
  }

  def render(search_input:String,search_output:String,form:Form[es_search_form.Pesquisa],post_search_Url:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(search_input,search_output,form,post_search_Url)(request)

  def f:((String,String,Form[es_search_form.Pesquisa],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (search_input,search_output,form,post_search_Url) => (request) => apply(search_input,search_output,form,post_search_Url)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-03T08:08:56.412
                  SOURCE: /Users/rafa/Documents/Baring_Git/form_es_connection/app/views/search.scala.html
                  HASH: f0b0c2513f8ebab6e811621d825a6a4fbbd416de
                  MATRIX: 794->1|1034->148|1137->226|1160->241|1199->243|1235->253|1501->492|1534->504|1609->552|1643->565|1686->581|1701->587|1732->609|1772->611|1809->621|1824->627|1860->642|1897->652|1912->658|1965->690|2001->699|2065->732
                  LINES: 21->1|26->2|28->4|28->4|28->4|30->6|46->22|46->22|48->24|48->24|50->26|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|53->29|54->30
                  -- GENERATED --
              */
          