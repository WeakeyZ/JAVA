package scala.demo.base01

object ArrayAndCollection {

  def main(args: Array[String]): Unit = {
    arrayTest()
    arrayTest2()
    arrayTest3()
    arrayTest4()
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

  def arrayTest4(): Unit = {
    val l1 = List(1, 2)
    val l2 = List(3, 4)

    // 使用右操作符 ::: 链接两个列表
    val l3 = l1 :: l2
    val l4 = l1 ::: l2

    val l5 = 1 :: 2 :: 3 :: 4 :: Nil
    val l6 = Nil.:: (1) .:: (2) .:: (3) .:: (4)
    println(l3)           //List(List(1, 2), 3, 4)
    println(l3.getClass)  //class scala.collection.immutable.$colon$colon
    println(l4)           //List(1, 2, 3, 4)
    println(l4.getClass)  //class scala.collection.immutable.$colon$colon
    println(l5)           //List(1, 2, 3, 4)
    println(l5.getClass)  //class scala.collection.immutable.$colon$colon
    println(l6)           //List(1, 2, 3, 4)
    println(l6.getClass)  //class scala.collection.immutable.$colon$colon

  }

}
