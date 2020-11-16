import collection.mutable

object maps{

    def main(args:Array[String]){
        val personal = mutable.Map(417 -> "daniel" ,55 ->"jose" ,  777 -> "SS");
        println(personal(417));
        personal(417)="Dgc7";
        println(personal(417));

    }
}