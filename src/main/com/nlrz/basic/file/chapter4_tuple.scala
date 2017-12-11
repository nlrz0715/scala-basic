package com.nlrz.basic.file

/**
  * Created by nlrz015 on 2017/12/10.
  */
object chapter4_tuple {
  def main(args: Array[String]): Unit = {
    val t = (1, 3.14, "Fred")
    var second = t._2
    println("second of t :" + second)
    var second1 = t _2

    //用于返回字符串按条件拆分
    //输出：(NY,ew ork)
    println("New York".partition(_.isUpper))

    //zip 绑定多个值在一起
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    for((s, v) <- pairs) println((s, v))
    //输出<<---------->>
    for ((s,n) <- pairs) print(s * n)

  }

}
