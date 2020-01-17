package scala.demo.base02

/**
  * 集合测试
  *   集合：不可重复元素集，以“哈希”方法对值进行组织，可以快速找到某个元素
  *   集合分类：不可变集和可变集
  */
object SetTest {

  def main(args: Array[String]): Unit = {
    test01()
    test02()
  }

  /**
    * 创建一个不可变集合，并添加元素
    * 注意：变指本身是否可变，使用var定义，可以实现添加元素，但是生成的是一个新的集合
    * 从下面可以看出，集合对象改变了
    */
  def test01(): Unit = {
    var set = Set("Hadoop", "Spark")
    println(set.getClass) //class scala.collection.immutable.Set$Set2
    set += "Scala"
    println(set.getClass) //class scala.collection.immutable.Set$Set3
    printSet(set)
  }

  /**
    * 创建一个可变集合，并添加元素
    * 注意：使用的是scala.collection.mutable.Set，即mutable为可变，immutable为不可变
    * 从下面可以看出，添加元素是在本集合内
    */
  def test02(): Unit = {
    val set = scala.collection.mutable.Set("Hadoop", "Spark")
    val set2 = scala.collection.mutable.Set("Hadoop", "Spark", "Java")
    println(set.getClass) //class scala.collection.mutable.HashSet
    println(set2.getClass) //class scala.collection.mutable.HashSet
    set += "Scala"
    println(set.getClass) //class scala.collection.mutable.HashSet
    for (i <- set) print(i + " ")
  }



  def printSet[T](set: Set[T]): Unit = {
    for (i <- set)
      print(i + " ")
    println()
  }
}
