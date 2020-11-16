class Amayusculas{
    def convercion(caracter:Char):Char= { 
       (caracter-32).toChar
    }
    def aMayusculas(dato:String):String = {
        return dato.map(x=>convercion(x));
    
    }
}