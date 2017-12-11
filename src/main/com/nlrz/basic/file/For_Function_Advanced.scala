package com.nlrz.basic.file

import scala.io.Source

/**
  * Created by nlrz015 on 2017/12/5.
  */
object For_Function_Advanced {
  def main(args: Array[String]): Unit = {
/*    for (i <- 1 to 2; j <- 1 to 2) print((100*i + j) + " ")
    println*/

/*    for (i <- 1 to 2; j <- 1 to 2 if i != j)  print((100*i + j) + " ")
    println*/

/*    def addA(x : Int) = x + 100
    val add = (x : Int) => x + 200
    println("The Result from a function is : " + addA(2))
    println("The Result from a val is : " + add(2))*/

/*    def fac(n : Int) : Int = if(n <= 0) 1 else n * fac(n - 1)
    println("The result from a fac is :" + fac(10))*/

/*    def combine(content : String, left: String = "[", right : String = "]") = left + content + right
    println("The result from a combine is : " + combine("I love Spark", "<<"))*/

/*    def connected(args : Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println("The result from a connected is : " + connected(1, 2, 3, 4, 5))*/

    lazy val file = Source.fromFile("d:\\adcfg1.json");
  }

}
