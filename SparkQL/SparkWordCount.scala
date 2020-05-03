import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext._


object SparkWordCount{
    def main(args:Array[String]) {
        val sc = new SparkContext("local", "Word Count", "/usr/local/spark", Nil, Map(), Map()) // the first map specifies the environment whilst the second map specifies the variables to worker nodes

        val inputFilePath = ""
        val input = sc.textFile(inputFilePath)
        val count = input.flatMap(line -> line.split(" "))
}