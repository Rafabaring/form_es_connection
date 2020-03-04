package models

import io.searchbox.client.config.HttpClientConfig
import io.searchbox.client.{JestClient, JestClientFactory}
import io.searchbox.core.{Bulk, Delete, Index, Search}
import io.searchbox.indices.{CreateIndex, IndicesExists}
import io.searchbox.client.JestClient
import io.searchbox.client.JestClientFactory
import io.searchbox.client.config.HttpClientConfig
import io.searchbox.indices.CreateIndex
import io.searchbox.core.Get
import io.searchbox.core.Search
import play.api.libs.json.{JsValue, Json}
import models.es_build_client
import play.mvc.BodyParser.Json

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
    // TO DO: use JSON format instead of string
    val search_result = client.execute(new Search.Builder(search).build)
    return search_result.toString
  }

}
