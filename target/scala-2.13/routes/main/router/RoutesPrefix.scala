// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rafa/Documents/Baring_Git/form_es_connection/conf/routes
// @DATE:Tue Mar 03 08:08:56 PST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
