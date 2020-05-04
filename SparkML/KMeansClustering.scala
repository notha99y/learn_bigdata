package org.apache.spark.examples.ml
import org.apache.spark.ml.clustering.KMeans
import org.apache.spark.ml.evaluation.ClusteringEvaluator
import org.apache.spark.sql.SparkSession

object KMeansExample {
    def main(args: Array[String]): Unit = {
        // sql Spark Session
        val spark = SparkSession.builder.appName("KMeansExample").getOrCreate()

        // Loads data
        val datasetFilePath = "kmeans_data.txt"
        val dataset = spark.read.format("libsvm").load(datasetFilePath)
        // KMeans
        val k = 2
        val seed = 99
        val kMeans = new KMeans().setK(k).setSeed(seed)
        val model = kMeans.fit(dataset)

        // Make Predictions
        val predictions = model.transform(dataset)

        // Evaluator
        val evaluator = new ClusteringEvaluator()
        val silhouette = evaluator.evaluate(predictions)
        println(s"Silhouette with squared euclidean distance = $silhouette")

        // Show results
        println("Cluster Centers: ")
        model.clusterCenters.foreach(println)

        spark.stop
        
    }
}