
object  saludar{
    def buendia(nombre:String):Unit={
        println(s"buen dia ${nombre}");
    }
}

object funcionIngcongnita{
    def imprimirDato(num:Int):Unit={
        println(num);
    }   
     def compararTamaño(num:Int):Boolean={
            val miNumero:Int=7;
            if(num==miNumero) true;
            else false
        }
    def adivinaMiNumero(TuNumero:Int):Unit={
        if(compararTamaño(TuNumero)==true){
            println("si acertaste ese es mi numero !!!");
        }
        else{
            println("no pirino fallaste");
        }
        }

    adivinaMiNumero(7);
    adivinaMiNumero(4);
    def main(args:Array[String]){
        def f(x:Int):Int=x*x;
        def g(h:Int=> Int)(x:Int)=h(x);
        def a(d:Int=> Int)=d(3);
       
        println(g(f)(12));
        val cuadrado=(x:Int)=>imprimirDato(x*x);
        cuadrado(2);
        val persona=saludar;
        persona.buendia("daniel");
        saludar.buendia("ss y jj");
        cuadrado.apply(2);
        val imprimirObjec= imprimirDato _
        imprimirObjec.apply(5);
    }

}