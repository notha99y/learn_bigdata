object FunctionTutorial {
    def main(args: Array[String]){
        println("Simple Addition")
        def getSum(num1: Int, num2: Int): Int = {
            return num1 + num2
        }
        println("5 + 4 = " + getSum(5,4))
        println("10 + 4 = " + getSum(10,4))
        println("30 + 4 = " + getSum(30,4))
        
        println("Function that is not returning anything")
        // Use the Unit
        def sayHi(name: String): Unit = {
            println(s"Hi $name! How are you!")
        }
        sayHi("Ren Jie")
    }
}