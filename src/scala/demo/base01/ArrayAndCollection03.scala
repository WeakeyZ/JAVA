package scala.demo.base01

import Array._

object ArrayAndCollection03 {

  def main(args: Array[String]): Unit = {
//    arrayTest()
//    arrayTest2()
//    arrayTest3()
//    arrayTest4()
    arraytest5()
    funTest()
  }

  def arrayTest(): Unit = {
    // 这里使用隐式调用apply方法，对数组内的成员进行赋值
    val arr = new Array[String](3)
    arr(0) = "Hello"
    arr(1) = " "
    arr(2) = "world!\n"

    for (i <- 0 to 2)
      print(arr(i))
  }

  def arrayTest2(): Unit = {
    // 使用update方法，对数组内的成员进行赋值
    val arr = new Array[String](3)
    arr.update(0, "Hello")
    arr.update(1, ",")
    arr.update(2, "world!\n")

    for (i <- 0 to 2)
      print(arr(i))
  }

  def arrayTest3(): Unit = {
    // 简单的初始化数组方法，这里其实也是省略了apply
    val arr = Array("Hello", " world,", "too!\n")
    val arr2 = Array.apply("Hello", " world,", "too!\n")

    for (i <- 0 to 2)
      print(arr(i))

    for (i <- 0 to 2)
      print(arr(i))
  }

  /**
    * 合并两个数组
    */
  def arrayTest4(): Unit = {
    val l1 = List(1, 2)
    val l2 = List(3, 4)

    // 使用右操作符 ::: 链接两个列表
    val l3 = l1 :: l2
    val l4 = l1 ::: l2

    val l5 = 1 :: 2 :: 3 :: 4 :: Nil
    val l6 = Nil .:: (1) .:: (2) .:: (3) .:: (4)
    println(l3)           //List(List(1, 2), 3, 4)
    println(l3.getClass)  //class scala.collection.immutable.$colon$colon
    println(l4)           //List(1, 2, 3, 4)
    println(l4.getClass)  //class scala.collection.immutable.$colon$colon
    println(l5)           //List(1, 2, 3, 4)
    println(l5.getClass)  //class scala.collection.immutable.$colon$colon
    println(l6)           //List(1, 2, 3, 4)
    println(l6.getClass)  //class scala.collection.immutable.$colon$colon
  }

  /**
    * 循环数组的方法
    */
  def arraytest5(): Unit = {
    val myList = Array("1", "2", "3", "4")
    printArray(myList)
  }

  /** 需要导包 Array._
    *   方法调用1:concat
    *
    */
  def funTest(): Unit = {
    val arr = Array("1", "2")
    val arr2 = Array("3", "4")

    // def concat[T]( xss: Array[T]* ): Array[T] 合并数组
    val arr3 = concat(arr, arr2)

    // 定义一个长度为4的数组
    var arr4 = new Array[String](4)

    // def copy( src: AnyRef, srcPos: Int, dest: AnyRef, destPos: Int, length: Int ): Unit 复制数组
    copy(arr, 0, arr4, 0, arr.length) // 复制
    copy(arr2, 0, arr4, 2, arr2.length)

    // def empty[T]: Array[T] 返回一个长度为0的数组
    printArray(arr3)
    printArray(arr4)
  }

  def printArray(arr:Array[String]): Unit = {
    for (x <- arr) {
      print(x + " ")
    }
    println()
  }

}
