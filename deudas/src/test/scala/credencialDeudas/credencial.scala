package credencialDeudas
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class credencialSpec extends AnyFlatSpec with Matchers {
    val cuentaMuñecoLego=Cuenta(77,110,8,0,880)
    val cuentaMuñecoHasbro=Cuenta(777,110,7,0,770)
    val Deudadaniel=Deudor("daniel",7,"1000417454",List(cuentaMuñecoHasbro,cuentaMuñecoLego))

}