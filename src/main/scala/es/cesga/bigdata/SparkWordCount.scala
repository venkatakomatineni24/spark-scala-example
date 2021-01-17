package es.cesga.bigdata

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SparkWordCount {
  def main(args: Array[String]) {
    val sconf = new SparkConf().setAppName("Spark WordCount")
    val sc = new SparkContext(sconf)

    val fileName = args(0)

    val wordCounts = sc.textFile(fileName).
      flatMap(line => line.split(" ")).
      map(word => (word, 1)).
      reduceByKey((a, b) => a+b)

    println(wordCounts.collect().mkString(", "))

    sc.stop()
  }
}
