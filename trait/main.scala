object traits{
    sealed trait Persona
    case class estudiante(nombre:String) extends Persona;
    case class profesor(nombre:String,cargo:String) extends Persona;

    def main(args:Array[String]){
        println("empesemos a probas  nuestros traits")
        val daniel:Persona=new estudiante("daniel")
        val sebas:Persona=new profesor("ss7","universal");
        daniel match {
            case profesor(nombre,cargo) => println(s"el nombre es ${nombre} y cargo ${cargo}")
            case estudiante(nombre) => println(s"el nombre del estudiante es ${nombre} ")
            case _ => println("no sabemos a donde preteneces ")
        }
    }

}