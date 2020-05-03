object ScalaTutorial {
    def main(args: Array[String]){
        var i = 0

        val randLetters = "ABCDEFGHI"

        for (i <- 0 until randLetters.length){
            println(i)
            println(randLetters(i))
        }
    }
}