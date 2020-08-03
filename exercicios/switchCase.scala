object Switch {
  def main(args: Array[String]) {
    println(testando(2))
    println(testando(3))
    println(testando(10))
    println(testando(3))
    
  }
  
  def testando(x: Int): String = x match {
    case 1 => "um"
    case 2 => "dois"
    case 3 => "tres"
    case 4 => "quatro"
    case 5 => "cinco"
    case 6 => "seis"
    case 7 => "sete"
    case _ => "qualquer numero" //deafult
  
  }
}