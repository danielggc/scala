

object recurcion{
    
    def factorialV1(numero:Long,resultado:Long=1l):Long={
        if(numero==0){
            println("terminamos");
            resultado
        }
        else{
            println(numero)
            factorialV1(numero-1,numero * resultado);
        }

    }
    def factorial(numero:Long):Long={
        if(numero==0){
            println("terminamos");
            1
        }
        else{
            println(numero)
            numero *factorial(numero-1);
     
            
        }

    }
   
    def main(args:Array[String]){
        
        println(s"vamos a calular el factorial de 20 ${factorial(4)}");
        println(s"vamos a calular el factorial de 20 ${factorialV1(6)}");

    }
}