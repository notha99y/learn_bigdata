// Spark Related
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

// SQL Functions
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql._
import org.apache.spark.sql.functions._

// If using data store
import org.apache.spark.sql.SQLContext // note that SparkContext is used for NoSQL data source
import org.apache.spark.sql.types._

object NoSQLExamples {
    def main(args: Array[String]){
        // 1. Create a spark configuration
        val conf = new SparkConf().setAppName("CustomerData").setMaster("local") // setAppName: sets the application name for reference. setMaster: the master url to connect. e.g. "local" to run locally. "local[4]" to run locally with 4 coores.

        // 2. Instantiate a new SparkContext using the configuration defined
        val sc = new SparkContext(conf)

        // 3. Create a Spark Session using SparkSession.builder
        val spark = SparkSession.builder().appName("Test").getOrCreate()

        // 4. (If require SQL). The main Spark SQL entry point is a SQL Context object which requires SparkContext. There are two implementations: SQLContext, HiveContext
        val sqlCtx = new SQLContext(sc)
        import sqlCtx._

        println("Reading a Titanic train into a dataframe RDD")
        val csvFilePath = "/home/notha99y/Downloads/train.csv"

        val df = spark.read.format("csv").option("header", true).option("inferSchema", true).csv(csvFilePath)

        df.show()
        df.count()
        df.printSchema()

    }
}