


object tuplas{
    def main(args:Array[String]){
        val tupla = (1,"daniel","1000",true);
        println(tupla._2);
        tupla.productIterator.toList.foreach(println);
        println(tupla.productArity);

    }
}