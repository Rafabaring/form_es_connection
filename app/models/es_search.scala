package models

import io.searchbox.core.Search
import net.liftweb.json._




object es_search {

  def perform_search(string_to_search: String): String = {
    // Instantiate
    val client = es_build_client.buildFactory()

    val search = """{
                   "query": {
                     "bool": {
                       "must": [
                         {"match": {"name.keyword": """ + '"' + string_to_search + '"' + """}}
                       ]
                     }
                   }
                 }"""
    // Search
    val search_result = client.execute(new Search.Builder(search).build)


    // Start Json parsing
    // Eu to convertendo o resultado da elastic search em um objeto, mas não to usando pra nada por enquanto. Deixei aqui pra vc ver se é útil
    val search_result_json = search_result.getJsonObject.get("hits")

    // println(search_result_json)
    // o resultado é isso
    // {"total":{"value":1,"relation":"eq"},"max_score":1.9924302,"hits":[{"_index":"form_index","_type":"_doc","_id":"5bNvYHABIpDZTJSsu2HY","_score":1.9924302,"_source":{"name":"test_new_index","title":"44","year":"3"}}]}


    // convert a String to a JValue object
    // essa é outra estratégia.
    // eu achei esse metodo parse(). O input eh o resultado da pesquisa ES como string
    val jValue = parse(search_result.getJsonString)
    println("")
    println("")
    println(jValue)
    println("")
    println("!")
    println(jValue.\\("name"))
    // JObject(List(JField(name,JString(test_new_index))))
    return search_result_json.toString()
  }

}
