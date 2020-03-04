// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rafa/Documents/Baring_Git/form_es_connection/conf/routes
// @DATE:Tue Mar 03 08:08:56 PST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def delete_index(index_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete_index" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("index_name", index_name)))))
    }
  
    // @LINE:11
    def create_index(index_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create_index" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("index_name", index_name)))))
    }
  
    // @LINE:8
    def listWidgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "widget")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def createWidget(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "widget")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def searchWidget(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
  }


}
