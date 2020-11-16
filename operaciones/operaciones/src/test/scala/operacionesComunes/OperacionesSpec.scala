package operacionesComunes

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OperacionesSpec extends AnyFlatSpec with Matchers {
  "operaciones" should "sumar dos numeros" in {
    val operaciones=new Operaciones(2,3)

    operaciones.suma(1,1) shouldEqual 2
   
  }

  "operaciones" should "fallar" in {
    val operaciones=new Operaciones(2,3)

   
    operaciones.suma(1,1) shouldEqual 3
  }

}
