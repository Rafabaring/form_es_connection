// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rafa/Documents/Baring_Git/form_es_connection/conf/routes
// @DATE:Tue Mar 03 08:08:56 PST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def delete_index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete_index",
      """
        function(index_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_index" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("index_name", index_name0)])})
        }
      """
    )
  
    // @LINE:11
    def create_index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create_index",
      """
        function(index_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create_index" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("index_name", index_name0)])})
        }
      """
    )
  
    // @LINE:8
    def listWidgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listWidgets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "widget"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def createWidget: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createWidget",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "widget"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def searchWidget: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.searchWidget",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
  }


}
