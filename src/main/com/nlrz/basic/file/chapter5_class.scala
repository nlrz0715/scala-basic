package com.nlrz.basic.file

/**
  * Created by nlrz015 on 2017/12/10.
  */
object chapter5_class {
  def main(args: Array[String]): Unit = {
    //调用类
    val myConter = new Counter
    //myConter.increment和myConter.increment()都可以
    //约定改值不去(),取值去掉(),如下所述
    myConter.increment()
    println(myConter.current)

    //class get和set默认就有（不能加private,加了获取不到）
    val person = new Person
    println(person.age)
  }

}

class Counter {
  //必须初始化字段
  private var value = 0

  def increment() {value += 1}

  def current() = value
 }

class Person {
  var age = 0
}

//重新定义getter和setter
class Person1 {
 //变成私有并改名
  private var privateAge = 0

  def age = privateAge

}
