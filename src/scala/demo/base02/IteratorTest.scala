package scala.demo.base02

/**
  * 在Scala中，迭代器（Iterator）不是一个集合，但是，提供了访问集合的一种方法。
  * 当构建一个集合需要很大的开销时（比如把一个文件的所有行都读取内存），迭代器就可以发挥很好的作用。
  */
object IteratorTest {

  def main(args: Array[String]): Unit = {
    test01()
  }

  def test01(): Unit = {
    val iter = Iterator("Hadoop", "Scala", "Java")
    // hasNext，不是hasNext()，会报错
    // next，和next()，都可以

    // 下面是两种遍历的方式
    while (iter.hasNext)
      println(iter.next())

    for (i <- iter)
      println(i)
  }
}
