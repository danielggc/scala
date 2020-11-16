object herencia{
    def main(args:Array[String]){
        print("hola como estas")
        val x:Int=3
        val y:Int=4
        val cordenadas=new pocicion(x,y)
    }
}
class pocicion(val _pocicionX:Int,val _pocicionY:Int){
    var nombre="parabola1"
    println(nombre)
    def movimiento(){
        val movimientoX:Int=_pocicionX
        val movimientoY:Int=_pocicionY
        print("la pocicion en x  es"+movimientoX+"la pocicion en y"+movimientoY)
    }    
}