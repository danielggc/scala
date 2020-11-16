


object exepciones{
    def main(args:Array[String]){
        val lista = (1 to 10).toList;
        lista.map(x => println(x));
        try{
            print(lista(191));
        }catch{
            case ex : Throwable => println("la pocicion del numero no existe");
        }
    }
}