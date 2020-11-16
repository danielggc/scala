import scala.collection.mutable.Map

object raiz{
    def main(args:Array[String]){
        val map1 :Map[String,String]= Map(("hola","como estas"),("yo bien ", "y tu"));
        val map2: Map[String, String] = Map("VD"-> "bien gracias", "GD" -> "que te importa pendejo ");
        
        println(s"${map2("GD")}");
    }
}
