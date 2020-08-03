//funcao para calcular fatorial
object funcao {
  def main(args: Array[String]) {
    for(i <- 1 to 10) {
        println("Fatorial de " + i + ": = " + fatorial(i))
    } 
  
  }

  def fatorial(n: BigInt):  BigInt = {
    if(n <= 1 ){
        1
    } else {
        n * fatorial(n - 1)
    }
  }
}