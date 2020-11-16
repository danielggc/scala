object herencia{
    def main(args:Array[String]){
        print("hola como estas")
        val x:Int=3
        val y:Int=4
        val cordenadas=new pocicion(x,y)
        cordenadas.movimiento()
        var cordenadasactial =new movimiento(x,y)
        cordenadasactial.move(y,x)

    }
}
class pocicion(val _pocicionX:Int,val _pocicionY:Int){
    val movimientoX:Int=_pocicionX
    val movimientoY:Int=_pocicionY
    print(nombre)
    def movimiento(){
        print("la pocicion en x  es"+movimientoX+"la pocicion en y"+movimientoY)
    }    
}

class movimiento(override val _pocicionX:Int,override val _pocicionY:Int)extends pocicion(_pocicionX,_pocicionY){
    def move(nuevaX:Int,nuevaY:Int){
        val movimientoAtualX=nuevaX+_pocicionX
        val movimientoAtualY=nuevaY+_pocicionY
        println("movimiento en x",movimientoAtualX+"movimiento en Y"+movimientoAtualY)

    }
}