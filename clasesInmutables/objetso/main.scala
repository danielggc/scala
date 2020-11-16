object Deudores{

    def main(args:Array[String]){
        val daniel=new Cuentas
        var d:Double=1
        while(d>0){
            daniel.guardarValor(650)
            d=daniel.restante()
            println(d)
        }
    }
}
object Cuentas{
    val totalCuotas:Int=8
    val valorCuota=650

}
class Cuentas(){
    val valorPagar:Int=Cuentas.valorCuota
    private var valorDepositado:Int=0
    def guardarValor(dineroDepositado:Int){
        valorDepositado+=dineroDepositado
    }


    def restante ():Double={    
       val valorRestante=(valorPagar*Cuentas.totalCuotas)-valorDepositado
       
       return valorRestante
    }

}