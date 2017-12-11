package com.nlrz.basic.file

import scala.io.Source

/**
  * Created by nlrz015 on 2017/12/5.
  */
object lesson3 {

  def main(args: Array[String]): Unit = {
/*    val triple = (100, "Scala", "Spark")
    println(triple._1)
    println(triple._2)
    println(triple._3)*/

/*    val array = Array(1, 2, 3, 4, 5)
    for (i <- 0 until(array.length)) {
      println(array(i))
    }

    for(elem <- array) {
      println(elem)
    }*/

/*    val ages = Map("Rocky" -> 27, "Spark" -> 5)

    for((k,v) <- ages) {
      println("key is" + k + ", value is " + v)
    }

    for ((k,_) <- ages) {
      println("key is" + k)
    }*/

    val file = Source.fromFile("d:\\adcfg.json")

    val file1 = Source.fromURL("http://spark.apache.org/")

    for(line <- file1.getLines()) {
      println(line)
    }

  }

}
