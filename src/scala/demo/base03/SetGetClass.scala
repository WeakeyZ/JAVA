package scala.demo.base03

/**
  * 实现Java中的私有化属性，调用类set，get方法
  */
class SetGetClass {
  // 私有字段，无法在外部直接使用字段名获取字段值
  private var privateValue = 0

  // Scala中的get方法
  def value: Int = privateValue

  // Scala中的set方法
  def value_=(newValue: Int): Unit = {
    privateValue = newValue
  }

  def increment(step: Int): Unit = {
    value += step
  }

  def current(): Int = value

}

object SetGetTest {
  def main(args: Array[String]): Unit = {
    val myClass = new SetGetClass
    println(myClass.value)      // 0

    myClass.value = 3
    println(myClass.value)      // 3

    myClass.increment(2)
    println(myClass.current())  // 5

    myClass.value_=(10)
    println(myClass.value)      // 10
  }
}
