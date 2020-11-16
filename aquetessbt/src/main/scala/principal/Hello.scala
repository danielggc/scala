
import sbt._


object PacktSubBuild  {
  
  lazy val root = Project("root", file(".")) dependsOn(ssoup)
  lazy val ssoup = RootProject(uri("https://github.com/P3trur0/ssoup.git")) 
  
}
object paquetes {
    def main(args: Array[String]){
      println("hola empesemos con importar paquetesqa")
    }
}