package com.nlrz.basic.file

import scala.collection.mutable.ArrayBuffer

/**
  * 给定一个整数的缓冲数组，我们想要移除第一个负数之外的所有负数
  * Created by nlrz015 on 2017/12/10.
  */
object chapter3_array {
  def main(args: Array[String]): Unit = {
    var a = ArrayBuffer(1, -2, 6, 9, -4, -86, 23, -56, 89)
    //第二种做法：
    //首先使用一个新数组用于记录满足条件的数组的下标
    var first = true
    val indexes = for(i <- 0 until a.length if first || a(i) > 0) yield {
      if(a(i) < 0) first = false; i
    }
    //然后将元素移动到该去的位置，截断尾端
    for(j <- 0 until indexes.length) a(j) = a(indexes(j))
    a.trimEnd(a.length-indexes.length)
    for (i <- a) println(i)



  }
}
