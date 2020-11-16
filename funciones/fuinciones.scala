object funciones{
    def main(args: Array[String]){
        println("hola como estas vamos a calcular el perimetro y el area de un numero que me des")
        val radios:Int=readInt()
        println(radios)
        operacionesMatematicas(radios)
        val dato:String=pruebacase(radios)
        println(dato)
    }
    def operacionesMatematicas(_radio:Int){
        val radio:Int =_radio
        val pi:Double=3.1416
        perimetroF(radio,pi)
        area(radio,pi)

    }
    def perimetroF(x:Int,y:Double){
        val perimetro=x*2*y
        print("el perimetro es",perimetro)
    }
    def area(x:Int,y:Double){
        val area:Double=x*x*y
        println("el area es",area)


    }
    def pruebacase(x:Int):String=x match{
        case 1=>"one"
        case 2=>"dos"
        case 3=>"tres"
        case _ =>"otro"

    }
}