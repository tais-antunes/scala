// função curry em scala representa uma cadeia de funçãoes cada 
//uma com um unico parametro(listas)
object FuncaoCurry {
  def main(args: Array[String]) {
    val str1:String = "Pao "
    val str2:String = "de "
    val str3:String = "Queijo"
    
    println("str1 + str2 + str3 = " + strcat(str1)(str2)(str3)) 
    
  }
  
  def strcat(s1: String)(s2: String)(s3: String) = {
    s1 + s2 + s3
  }
  
  

}