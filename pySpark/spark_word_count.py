from pyspark import SparkConf, SparkContext

conf = SparkConf().setMaster("local").setAppName("WordCount")
sc = SparkContext(conf = conf)
input_fp = '/home/notha99y/Documents/personal_projects/learn_spark/SparkQL/words.txt'
rdd = sc.textFile(input_fp)
count = rdd.flatMap(lambda line:line.split(' ')).map(lambda word: (word,1)).reduceByKey(lambda a,b:a+b)
count.saveAsTextFile("wc_out")