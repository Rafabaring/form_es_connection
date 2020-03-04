package models

import io.searchbox.client.{JestClient, JestClientFactory}
import io.searchbox.client.config.HttpClientConfig


object es_build_client {

  // Factory method
  def buildFactory(): JestClient = {
    val factory: JestClientFactory = new JestClientFactory

    factory.setHttpClientConfig (
      new HttpClientConfig.Builder("http://localhost:9200")
        .multiThreaded (true)
        .defaultMaxTotalConnectionPerRoute(2)
        .readTimeout(60000)
        .maxTotalConnection(10)
        .build)

    factory.getObject
  }

}
