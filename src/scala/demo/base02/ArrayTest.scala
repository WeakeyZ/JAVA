package scala.demo.base02

object ArrayTest {
  def main(args: Array[String]): Unit = {
    test1()
    test02()
  }

  /**
    * 创建数组，且查看每个类型数组的初始值
    */
  def test1():Unit = {
    val arr = new Array[Int](3)
    printArray(arr)           // 0 0 0

    val arr2 = new Array[String](3)
    printArray(arr2)          // null null null

    val arr3 = new Array[Char](3)
    printArray(arr3)          //       ，表示Char初始化为空格，可以把打印方法空格替换为-，结果显示为 - - -

    val arr4 = new Array[Float](3)
    printArray(arr4)          // 0.0 0.0 0.0

    val arr5 = new Array[Double](3)
    printArray(arr5)          // 0.0 0.0 0.0

    val arr6 = new Array[Long](3)
    printArray(arr6)          // 0 0 0

    val arr7 = new Array[BigDecimal](3)
    printArray(arr7)          // null null null

    val arr8 = Array("Hadoop", "handle", "BigData", 1)
    printArray(arr8)          // 简写创建数组
    println(arr8)             // 数据类型Scala会推断出数组类型，当不同数据类型会推断类型为java.lang.Object
  }

  /**
    *
    */
  def test02(): Unit = {
    val arr = new Array[String](3)
    arr(0) = "Hadoop"
    arr(1) = "Handle"
    arr(2) = "BigData"
    printArray(arr)
  }

  /**
    * 使用泛型入参，遍历打印数组元素
    * @param arr 入参数组
    * @tparam T 泛型
    */
  def printArray[T](arr: Array[T]) : Unit = {
    for (i <- arr)
      print(i + " ")
    println()
  }
}
