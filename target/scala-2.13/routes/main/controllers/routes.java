// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rafa/Documents/Baring_Git/form_es_connection/conf/routes
// @DATE:Tue Mar 03 08:08:56 PST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSearchController SearchController = new controllers.ReverseSearchController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSearchController SearchController = new controllers.javascript.ReverseSearchController(RoutesPrefix.byNamePrefix());
  }

}
