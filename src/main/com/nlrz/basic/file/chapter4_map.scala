package com.nlrz.basic.file

import scala.collection.SortedMap

/**
  *
  * Created by nlrz015 on 2017/12/10.
  */
object chapter4_map {
  def main(args: Array[String]): Unit = {

    //scala.collection.mutable.Map 才是可变的映射允许增添值
    var scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 16);

    //映射取值，追加和去除元素
    //val bobosScore = scores("Bob");println(bobosScore)
    //val bobosScore = if(scores.contains("Bob")) scores("Bob") else 0
    val bobosScore = scores.getOrElse("Bob", 0)
    scores("Bob") = 20
    println("scores1:" + scores)
    scores += ("Bob" -> 30, "Fred" -> 7)
    println("scores2:" + scores)
    scores -= ("Alice")
    println("scores3:" + scores)

    //不可变映射添加和去除操作
    val scores1 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 16)
    val scores3 = scores1 + ("Bob" -> 30, "Fred" -> 7)

    //迭代映射
    println("scores--keyset:" + scores.keySet)
    for (v <- scores.values) println(v)

    //key和value进行反转
    val scoresReverse = for((k, v) <- scores) yield (v, k)
    println("scoresReverse" + scoresReverse)

    //已排序映射
    val sortedScores = SortedMap("Alice" -> 10, "Bob" -> 3, "Cindy" -> 16);
    println("sortedScores" + sortedScores)
  }
}
