import scala.collection.mutable.Map

object maps{
    def convercion(caracter:Char):Char= { 
       (caracter-32).toChar
    }
    def aMayusculas(dato:String):String = {
        return dato.map(x=>convercion(x));
    
    }
    def main(args:Array[String]){
        val personas:Map[String,Int] = Map(("daniel"-> 777 ),("jjj"-> 555 ),("ssss" -> 666));
        println(personas("daniel"));
        val nombre:String="daniel";
        println(aMayusculas(nombre));
        println(personas.map{case(x,y) => aMayusculas(x) -> y });
        val personas=Map((100->"daniel"),(200->"joxe"));
        val joxe=personas(100);
        personas.map{case(x,y) => x-> println(y)};
              
    }
}
