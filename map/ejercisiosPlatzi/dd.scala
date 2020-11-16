object colecciones {
  def main(args: Array[String]): Unit = {
    val lista: Seq[Int] = Seq(1,3,5,7,9,9,11,17,20,20,100)

    medidasT(lista)
  }

  //  funciones

  def media(args: Seq[Int]): Int = {
    val media = (args.sum)/(args.size)
    media
  }

  def mediana(args: Seq[Int]): Int = {
    val indice = (args.size/2)
    args(indice)
  }

  def moda(args: Seq[Int]): Int = {
    args.groupBy(x => x).maxBy(x => x._2.size)._1
  }


  // funcion de medidas de tendencia central
  def medidasT(args: Seq[Int]): Unit = {
    val lista = args.sorted
    val mapa = Map(
      "media"   -> media(lista),
      "mediana" -> mediana(lista),
      "moda"    -> moda(lista)
    )


    mapa foreach ( x => println(x._1 + " -> " + x._2) )

  }
}