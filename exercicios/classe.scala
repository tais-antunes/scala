class Conta(agencia:String, conta:String, valorSaldo:Float) {
  var numeroAgencia:String = agencia
  var numeroConta:String = conta
  var saldo:Float = valorSaldo
  
  def deposito(valor:Float): Unit = {
    saldo = saldo + valor
  }

  def saque(valor:Float): Boolean = {
    if(saldo - valor >= 0) {
      saldo = saldo - valor
      return true
    }
    false
  }
  
  override def toString(): String = 
  "(Agencia: " + numeroAgencia + 
  ", Conta: " + numeroConta + 
  ", Saldo: " + saldo + ")";
}

