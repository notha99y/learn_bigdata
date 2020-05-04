import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object GuessNumber {
    def main(args:Array[String]){
        var numberGuess = 0
        val secretNum = 15
        do {
            printf("Guess a number ")
            numberGuess = readLine.toInt
        } while(numberGuess != secretNum)

        printf("You guessed the secret number %d\n", 15)
    }
}