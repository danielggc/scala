


object whiles {
    def texto(caracteres:Int):Unit={
        if(caracteres<20){
            throw new ArithmeticException("no es un articulo")  
        }
        else{
            println("paso tu texto")
        }
        
    }
    def main(args:Array[String]){
        val numerosPrimos:List[Int] = List(1,3,5,7,11,13,2,4,5,6,8,12);
        var i:Int = 0       
        while(i < numerosPrimos.length){
            println(numerosPrimos(i))
            i+=1
        }
        var clave:String=" "
        println("escriva la contraceña");
        do{
            clave = scala.io.StdIn.readLine;
            if(clave =="clavedd7") print("es correcta la clave");
            else println("la clave es incorrecta");
        }while(clave != "clavedd7")
    }
}    