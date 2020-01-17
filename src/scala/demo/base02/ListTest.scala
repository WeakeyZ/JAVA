package scala.demo.base02

/**
  * List列表的测试
  */
object ListTest {
  def main(args: Array[String]): Unit = {
    test01()
  }

  def test01(): Unit = {
    // 初始化列表
    val list = List(1, 2, 3)
    printList(list) // 1 2 3

    val list2 = 1 :: 2 :: 3 :: Nil // Nil可以视为长度为0的空列表，"::"右操作符作用是左边的元素添加到右边列表的头部位置
    val list3 = 4 :: list2
    val list4 = list2 ::: list3 // 使用:::操作符，合并两个列表，产生一个新的列表
    printList(list2) // 1 2 3
    printList(list3) // 4 1 2 3
    printList(list4) // 1 2 3 4 1 2 3
  }

  /**
    * 使用泛型入参，遍历打印数组元素
    *
    * @param arr 入参数组
    * @tparam T 泛型
    */
  def printList[T](arr: List[T]): Unit = {
    for (i <- arr)
      print(i + " ")
    println()
  }
}
