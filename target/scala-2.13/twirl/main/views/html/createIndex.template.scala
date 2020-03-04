
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

object createIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(index_name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Index</title>
</head>
<body>
<p>"""),_display_(/*10.5*/index_name),format.raw/*10.15*/(""" """),format.raw/*10.16*/("""created</p>
</html>
</body>"""))
      }
    }
  }

  def render(index_name:String): play.twirl.api.HtmlFormat.Appendable = apply(index_name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (index_name) => apply(index_name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-03T08:08:56.440
                  SOURCE: /Users/rafa/Documents/Baring_Git/form_es_connection/app/views/createIndex.scala.html
                  HASH: 9568030ac07e0405d5d79308e3dfc272f22f954a
                  MATRIX: 735->1|849->22|876->23|1020->141|1051->151|1080->152
                  LINES: 21->1|26->2|27->3|34->10|34->10|34->10
                  -- GENERATED --
              */
          