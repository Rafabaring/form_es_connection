package models

import io.searchbox.core.Index
import play.api.libs.json.{JsValue, Json}




object es_add_doc{

  // Data to be added
  abstract class Humanity{
    val name: String
    val weight: Int
    val year: Int

    // convert to json
  def transform_json(): JsValue = {
    val j_value = """
                      {
                        "name" :"""" + this.name + """",
                        "weight" :"""" + this.weight + """",
                        "year" :"""" + this.year + """"
                      }
                      """
    return Json.parse(j_value)
    }
  }






  def add_doc(name_individual: String, weight_individual: Int, year_individual: Int) {
    // Instantiate
    val client = es_build_client.buildFactory()

    val individual = new es_add_doc.Humanity {
      override val name: String = name_individual
      override val weight: Int = weight_individual
      override val year: Int = year_individual
    }

    // Adding document to index
    client.execute(new Index.Builder(Json.stringify(individual.transform_json())).index("form_index").`type`("_doc").build())
  }



}

