object ForLoopTutorial{
    def main(args: Array[String]){
        val randLetters = "ABCDEFGHI"
        println("Random Letters")
        for (i<-0 until randLetters.length){
            println(randLetters(i))
        }
        
        println("A List")
        val aList = List(1,2,3,4,5)
        for (i <- aList){
            println(i)
        }

        println("Even List")
        var evenList = for (i <- 1 until 20
            if (i%2) == 0
         ) yield i

        println(evenList)

        println("Double For Loop")
        for (i <- 0 to 5; j <- 6 to 10){
            println(i)
            println(j)
        }

        print("Break Statement\n")
        // You implement break by using the return
        def printPrimes(){
            val breakNum = 11
            val primeList = List(1,2,3,5,7,11)
            for (i<-primeList){
                if (i == breakNum){
                    return
                }
                if (i != 1){
                    println(i)
                }
            }
        }
        printPrimes
    }
}