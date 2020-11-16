object mediasArimeticas{
    def llamar(lista:List):Map={
        
    }
    def moda(lista:List):Int={
        val grupacion=lista.groupBy(x=>x);
        grupacion.map(x => x.map((a,b)=>b.size))
    }
}


object principal{
    def datosPopulares(num:Int):Int={
        println("hola estoy en una encuesta me puedes dar un numero")
        num +readInt()
    
    }
    def main(args:Array[String]):Unit={
        val numero:List[Int]=List(0,0,0,0,0,0);
        val numeroMasTomado:List[Int]=numero.map(x=> datosPopulares(x));
        numeroMasTomado.foreach(x => println(s"estos son los numero  que recolectamos ${x}"));
        println("vamos haora a mira la moda");
        ///groupby agrpo los valores repetidos en un map 
        val repetidos=numeroMasTomado.groupBy(x=>x)
        repetidos.foreach(x=>println(x));
        println(repetidos(2));
        val dd1=repetidos.maxBy(x => x._2.size);
        println(dd1);
    } 
}