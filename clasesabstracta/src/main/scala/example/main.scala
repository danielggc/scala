object abstracta{
    def main(sgrs:Array[String]){        
        var daniel=new persona("daniel",19)

        daniel.cambiarNombre("daniel")
        print(daniel.retornarNombre())
    }
    class persona{
        private var edadPribada=0
        private var nombres:String="anonimo"
        def edad=edadPribada
        def edad_=(nuevaEdad:Int){
            if(nuevaEdad>edadPribada){
                edadPribada=nuevaEdad
            }  
        }  
        
        def cambiarNombre(nombreNuevo:String){
            nombres=nombreNuevo    
        }
        def retornarNombre():String={
            return nombres
        }

        def this(nombre:String,eded:Int){
            this()
            this.edad=eded
            print(edadPribada)
        }
    }
}