import scala.collection.mutable.ListBuffer

object listas{
    def main(args:Array[String]){
        val listaMutable = ListBuffer(22,22,1,2,3,4,5,55);
        println(listaMutable);
        listaMutable += 22;   
        println(listaMutable);
        listaMutable.foreach(x=>println(x));
        listaMutable -=22;
        //listaMutable.map(x => listaMutable(x) = +1);
        println(" ");
        listaMutable.foreach(println);
        listaMutable(0) -=22
        println(" ");
        listaMutable.foreach(println);

    }
}