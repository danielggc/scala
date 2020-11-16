object clases{
    def main(args:Array[String]){
        val poscion:Int=readInt()
        println("vamos por las cordenadas"+poscion)
        val cordenadasParabola=new parabola(poscion)
        cordenadasParabola.puntos()
    }
    class parabola(_posicionY:Int){
        val posicionY:Int=_posicionY
        def puntos(){
            for(d:Int<-0 to 10){
                val cordenaX:Int=d
                val cordenaY:Int=(cordenaX*cordenaX)+_posicionY
                println("las cordenadas son "+cordenaY)

            }
        }    

    }

}