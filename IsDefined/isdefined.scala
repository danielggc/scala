object expciones{
       
       def main(args:Array[String]):Unit={
              val personas=Map((100->"daniel"),(200->"joxe"));
              val joxe=personas.get(200);
              if(joxe.isDefined){
                     println(joxe.get);
              }
             
              val words = Map(30 -> "ss", 20 -> "Negro");
              val result = words.get(30);
              println(result);
              val result2 = result.getOrElse("unknown")
              println(result2)
            
              
       }

}
