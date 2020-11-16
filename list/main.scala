import scala.collection.parallel.FactoryOps

case class people(name:String,edad:Int,identidad:String,estado:Boolean);
object listas{
    def parInpar(numero:Int):Boolean=if(numero % 2 ==0) return true else return false;
    def potenciaNumero(numero:Int):Double =math.pow(numero,2);
    def main(args:Array[String]){
        val nombres = List("daniel","laloa","lelo")
        println(nombres(1));
        val personasDatos:List[people] = List(people("daniel",19,"100.417454",true),people("dd7",17,"100.417.33",true),people("dgg",12,"100.417.777",false));
        val daniel:people=personasDatos(0);
        val edad:Int=daniel.edad;
        val tamañoPersonasDatos :Int=nombres.length;
        val texto:List[Int]=List(1,2,3,4,5,6,7,8);
        val Textranfomacion=texto.mkString("A");
        val listaNumeros:List[Int] = List(7,1,2,3,4,5,5,1,2,3,3,4);
        val listaSet=listaNumeros.toSet;
        println("esta es una lista sin repeticiones");
        println(Set(1,1,1,1,2,3,4,5,5,1,2,3,3,4));
        println("esta es una lista convertida a set");
        println(listaNumeros.toSet);     
        println("verifica si esta el dato");
        println(listaSet(17));
        val listaNumeroAuto:List[Int] = (0 to 10).toList;
        println(listaNumeroAuto);
        val listaNumeroCuadrado:List[Double] = (listaNumeros.map(x => potenciaNumero(x)));        
        val tamañoPalabras:List[Int] = nombres.map(x => x.length);
        val filtroPares:List[Int] = listaNumeroAuto.filter(x=>parInpar(x))
        println("filtro de nuemros");

        println(filtroPares);
        println(tamañoPalabras(2));
        println(listaNumeroCuadrado(4));
        println(personasDatos(1));
        println(Textranfomacion);
        println(edad);
        println(tamañoPersonasDatos);
        println(listaNumeroAuto.reduce((x,y)=>x+y));
        //ejercisios
        println(texto.map(x=>parInpar(x)));    
        
        
        //listas anidasdas

        val reguistroUsuario=List(("daniel","dgc7",777),("sss","sss77",777),("jjjj","jj55",55));
        reguistroUsuario.foreach(x => println(s"estos son los nombres ${x._1}"));
        reguistroUsuario.foreach(x => println(s"estos son los usuario  de la persona  ${x._2}"));
         


    }
}