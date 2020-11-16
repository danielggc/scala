

object casos{
    case class Persona(nombre:String,edad:Int);
    def validarEdad(xPersona:Persona):Unit={
        xPersona match {
            case y if(y.edad > 17 && y.nombre=="Maria")=>println("maria es mayor de edad");
            case y if(y.edad < 18 && y.nombre=="Maria")=>println("maria es menor de edad");
            case y if(y.edad >= 18) =>println(" eres mayor de edad")
            case _ => println(" no es mayor de edad");
            
        }

    }
    def abesedario(x:Seq[Int]):Unit={
        x match {
            case List(a,b,c)=> println(a+b+c)
            case List(a,b,c,e) =>{
                println(a+b+c+1000+e)
            }
            case _ => println("nadad");
        }

    }
    def main(args:Array[String]){
        val persona1 = Persona("dane",18);
        val persona2 = Persona("denn",11);
        val persona3 = Persona("Maria",20);
        validarEdad(persona3);
        validarEdad(persona2);
        validarEdad(persona1);
        abesedario(Seq(1,25,5,4));
    }
}