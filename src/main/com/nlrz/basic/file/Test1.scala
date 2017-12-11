package com.nlrz.basic.file

import java.io.File

/**
  * Created by nlrz015 on 2017/12/5.
  */
object Test1 {

  def main(args: Array[String]): Unit = {
    //println("hello world!")
    //doWhile
    //println(looper(100, 298))

    //val file = if(!args.isEmpty) args(0) else "scala.xml"
    //println(file)

/*    for(i <- 1.to(10)) {
      println("Number is :" + i)
    }*/
/*
    for(i <- 1 to 10) {
      println("Number is :" + i)
    }*/

/*    val files = (new File(".")).listFiles();
    for ( file <- files) {
      println(file)
    }*/

    val n = 99
    val file = "spark.txt"
    try {
      val half = if (n % 2 == 0) n / 2 else throw
        new RuntimeException("N must be event")
    } catch {
      case e : Exception => println("The exception is " + e.getMessage)
    }finally {

    }
  }

  def looper(x : Long, y : Long) : Long = {
    var a = x
    var b = y
    while (a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def doWhile(): Unit = {
    var line = ""
            do {
              println("please input some word")
              line = readLine()
                      println("read:" + line)
            } while (line != "")
  }


}
