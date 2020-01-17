package scala.demo.base02

/**
  * 映射测试
  * 映射Map：键值对的集合，可以通过Debug断点查看，键值都是Tuple元组实现的
  */
object MapTest {

  def main(args: Array[String]): Unit = {
    test01()
    test02()
  }

  /**
    * 创建一个不可变映射Map
    * 不可变映射：无法更新映射中的元素，无法新增匀速
    */
  def test01(): Unit = {
    println("=====================不可变映射=====================")
    val map = Map("Scala" -> "def main(args: Array[String]): Unit = {}", "Java" -> "public static void main(String[] args) {}")
    println(map.getClass) //class scala.collection.immutable.Map$Map2
    println(map("Scala"))
    println(map("Java"))
  }

  /**
    * 创建一个可变映射，需要导包
    */
  import scala.collection.mutable.Map
  def test02(): Unit = {
    println("======================可变映射======================")
    val map = Map("Scala" -> "def main(args: Array[String]): Unit = {}", "Java" -> "public static void main(String[] args) {}")
    map("Java") = "This is changed"
    map("Python") = "def main"
    map += ("C" -> "I'm boss") // 由于键值为元组，所以可以使用()定义元组，添加新映射

    for ((k, v) <- map) println(k, v)
    print("Key循环遍历：")
    for (k <- map.keys) print(k + " ")
    print("\nValue循环遍历：")
    for (v <- map.values) println(v)

  }

}
