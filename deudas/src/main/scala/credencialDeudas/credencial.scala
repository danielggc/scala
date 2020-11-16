package credencialDeudas

case class Deudor(nombre:String, id:Int, cedula:String, cuentas:List[Cuenta])
case class Cuenta(id:Int, valorCuotas:Int,nuemeroCuotasInicial:Int,nuemeroCuotasPagadas:Int,valorDeudado:Int)
trait ValidarValores{
    def valorCuotaPagar(cuenta:Cuenta,valorPagar:Int){
        if (cuenta.valorCuotas==valorPagar){    
            1
        }    
        else{
            0
        }
    }
    def valorDeudaPagar(cuenta:Cuenta,valorPagar:Int){
        if(valorPagar==(cuenta.valorCuotas*cuenta.nuemeroCuotasInicial)){
            1
        }    
        else{
            0
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