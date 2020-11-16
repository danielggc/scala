import scala.concurrent.future
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random
import scala.util.{Success, Failure}


object PreparacionCafe{
    
    type CoffeeBeans = String
    type GroundCoffee = String
    case class Water(temperature: Int)
    type Milk = String
    type FrothedMilk = String
    type Espresso = String
    type Cappuccino = String
    case class GrindingException(msg: String) extends Exception(msg)
    case class FrothingException(msg: String) extends Exception(msg)
    case class WaterBoilingException(msg: String) extends Exception(msg)
    case class BrewingException(msg: String) extends Exception(msg)
    

    def main(args:Array[String]):Unit={
       /* val n:Int=15;
        grind("capuchino").onComplete {
            case Success(ground) => println(s"tengo mi $ground")
            case Failure(ex) => println("¡Este molinillo necesita un reemplazo, en serio!")
        }
        val EstadoTemperature: Future[Boolean] = heatWater(Water(1500)).map { water =>
            println("estamos en el futuro!") 
            (80 to 85).contains(water.temperature)
        }

        val temperaturaCapuchino:Future[Boolean]=heatWater(Water(50)).flatMap{
            water => temperatureOkay(water)
        }
        
        Thread.sleep(Random.nextInt(20000))
        println(EstadoTemperature);
        println(temperaturaCapuchino);
        */
        prepareCappuccinoSequentially();
        while(true){
            
        }
    }
    def combine(espresso: Espresso, frothedMilk: FrothedMilk): Cappuccino = "cappuccino"
    def prepareCappuccinoSequentially(): Future[Cappuccino] = {
        for{
            ground <- grind("arabica beans")
            water <- heatWater(Water(20))
            foam <- frothMilk("milk")
            espresso <- brew(ground, water)
        } yield combine(espresso,foam)
    }
    
    def temperatureOkay(water:Water):Future[Boolean]=Future{
        (80 to 85).contains(water.temperature);
    }
    def grind(beans: CoffeeBeans): Future[GroundCoffee] = Future {
        println("comoensado la molienda de cafe ")
        Thread.sleep(Random.nextInt(3000))
        if (beans == "frijoles Cocidos") throw GrindingException("estas bromiando")
        println("terminasmos de moler el cafe ...")
        s"cafe molido para $beans"
    }
    def heatWater(water: Water): Future[Water] = Future {
        println("calentando el agua ahora")
        Thread.sleep(Random.nextInt(2000))
        if(water.temperature>=1000) throw WaterBoilingException("se sobre calento la tetera")
        println("el hagua esta a 85 celcius")
        water.copy(temperature = 85)
    }
    def frothMilk(milk: Milk): Future[FrothedMilk] = Future {
        println("sistema de espumado de leche activado!")
        Thread.sleep(Random.nextInt(2000))
        println("apagar el sistema de espumado de leche")
        s"espumado $milk"
    }
    def brew(coffee: GroundCoffee, heatedWater: Water): Future[Espresso] = Future {
        println("feliz cerbeza:)")
        Thread.sleep(Random.nextInt(2000))
        println("¡está elaborado!")
        "espresso"
    }
}


