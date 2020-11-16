package example
object deudores {
    def main(args:Array[String]){
        val cuentaMuñecoLego=Cuenta(77,110,8,0,880)
        val cuentaMuñecoHasbro=Cuenta(777,110,7,0,770)
        val Deudadaniel=Deudor("daniel",7,"1000417454",List(cuentaMuñecoHasbro,cuentaMuñecoLego))
        print("holaaa")
        print("holaaa")
    }
    
}
case class Deudor(nombre:String, id:Int, cedula:String, cuentas:List[Cuenta])
case class Cuenta(id:Int, valorCuotas:Int,nuemeroCuotasInicial:Int,nuemeroCuotasPagadas:Int,valorDeudado:Int)
trait ValidarValores{
    def valorCuotaPagar(cuenta:Cuenta,valorPagar:Int){
        if (cuenta.valorCuotas==valorPagar){    
            0
        }    
        else{
            print("funciona")
        }
    }
    def valorDeudaPagar(cuenta:Cuenta,valorPagar:Int){
        if(valorPagar==(cuenta.valorCuotas*cuenta.nuemeroCuotasInicial)){
            print("na")
        }    
        else{
            print("o si")
        }

    }
}
trait OperacionesCuenta {
    def pagarCuota(cuenta:Cuenta):Cuenta={
            cuenta.copy(nuemeroCuotasPagadas = cuenta.nuemeroCuotasPagadas+1,valorDeudado = cuenta.valorDeudado-cuenta.valorCuotas)

    }
    def pagarDeuda(cuenta:Cuenta,valorPagar:Int):Cuenta={
            cuenta.copy(nuemeroCuotasPagadas = cuenta.valorCuotas,valorDeudado = 0)
    }

 }

 object OperacionesCuenta extends OperacionesCuenta
 object ValidarValores extends ValidarValores