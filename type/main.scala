

object recurcion{
    type personaId =Int
    case class Persona(id:personaId,nombre:String);
    def main(args:Array[String]){
        type estudiante =Persona
         val julian= new estudiante(100,"julian");
    
    }
}