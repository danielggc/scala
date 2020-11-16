object graficas{

    def main(args:Array[String]){
        val graficaRecta=new punto2D(2,7)
        println(graficaRecta.descripcion)  
        val cordenas01=graficaRecta.mover(6,7)  
        print(cordenas01.descripcion)
        val desplasarRecta =graficaRecta.+(5)
        print(desplasarRecta.descripcion)
    }
    class punto2D(_posicionX:Int,_posicionY:Int){
        val posicionX:Int=_posicionX
        val posicionY:Int=_posicionY
        def mover(nuevoPuntoX:Int,nuevoPuntoY:Int):punto2D={
            return new punto2D(nuevoPuntoX+posicionX,nuevoPuntoY+posicionY)
            
        }
        def +(nuevosPuntos:punto2D):punto2D={
            new punto2D(posicionX+nuevosPuntos.posicionX,posicionY+nuevosPuntos.posicionY)

        }
        def +(desplasar:Int):punto2D={
            return new punto2D(posicionX+desplasar,posicionY+desplasar)
            new punto2D(posicionX+34,posicionY+3)
        }
        def descripcion="("+posicionX+","+posicionY+")"
    }
}