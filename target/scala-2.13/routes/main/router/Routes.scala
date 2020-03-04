// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rafa/Documents/Baring_Git/form_es_connection/conf/routes
// @DATE:Tue Mar 03 08:08:56 PST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:13
  SearchController_0: controllers.SearchController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:13
    SearchController_0: controllers.SearchController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, SearchController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, SearchController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widget""", """controllers.HomeController.listWidgets"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widget""", """controllers.HomeController.createWidget"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_index""", """controllers.HomeController.delete_index(index_name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create_index""", """controllers.HomeController.create_index(index_name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.searchWidget"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_listWidgets1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widget")))
  )
  private[this] lazy val controllers_HomeController_listWidgets1_invoker = createInvoker(
    HomeController_2.listWidgets,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listWidgets",
      Nil,
      "GET",
      this.prefix + """widget""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_createWidget2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widget")))
  )
  private[this] lazy val controllers_HomeController_createWidget2_invoker = createInvoker(
    HomeController_2.createWidget,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createWidget",
      Nil,
      "POST",
      this.prefix + """widget""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_delete_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_index")))
  )
  private[this] lazy val controllers_HomeController_delete_index3_invoker = createInvoker(
    HomeController_2.delete_index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete_index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delete_index""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_create_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create_index")))
  )
  private[this] lazy val controllers_HomeController_create_index4_invoker = createInvoker(
    HomeController_2.create_index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create_index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """create_index""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SearchController_searchWidget5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_searchWidget5_invoker = createInvoker(
    SearchController_0.searchWidget,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "searchWidget",
      Nil,
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_HomeController_listWidgets1_route(params@_) =>
      call { 
        controllers_HomeController_listWidgets1_invoker.call(HomeController_2.listWidgets)
      }
  
    // @LINE:9
    case controllers_HomeController_createWidget2_route(params@_) =>
      call { 
        controllers_HomeController_createWidget2_invoker.call(HomeController_2.createWidget)
      }
  
    // @LINE:10
    case controllers_HomeController_delete_index3_route(params@_) =>
      call(params.fromQuery[String]("index_name", None)) { (index_name) =>
        controllers_HomeController_delete_index3_invoker.call(HomeController_2.delete_index(index_name))
      }
  
    // @LINE:11
    case controllers_HomeController_create_index4_route(params@_) =>
      call(params.fromQuery[String]("index_name", None)) { (index_name) =>
        controllers_HomeController_create_index4_invoker.call(HomeController_2.create_index(index_name))
      }
  
    // @LINE:13
    case controllers_SearchController_searchWidget5_route(params@_) =>
      call { 
        controllers_SearchController_searchWidget5_invoker.call(SearchController_0.searchWidget)
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
