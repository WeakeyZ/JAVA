package scala.demo.base02

/**
  * 元组测试类
  *   元组：可以包含不同类型的元素
  */
object TupleTest {

  def main(args: Array[String]): Unit = {
    test01()
  }

  def test01():Unit = {
    val tuple1 = ("BigData", 2015, 0.45)
    println(tuple1._1, tuple1._2, tuple1._3)
  }

}
