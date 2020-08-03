object OperadoresMat {
  def main(args: Array[String]) {
    println("Realizando operações matematicas em scala") 
    operacoes((x, y) => x + y, 10, 16);
    operacoes((x, y) => x - y, 29, 19);
    operacoes((x, y) => x * y, 32, 12);
    operacoes((x, y) => x / y, 23, 14);
  } 
    
    def operacoes(callback: (Int, Int) => Int, x: Int, y: Int) {
      println(callback(x, y))
    }

} 
