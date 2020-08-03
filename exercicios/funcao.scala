object Loop {
    def main (args: Array[String]) {
        println("Valor de retorno: " + addInt(5,7));

    }

    def addInt(a:Int, b:Int) : Int = {
        var sum:Int = 0;
        sum = a + b;

        return sum;
    }
}