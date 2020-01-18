package scala.demo.base03

/**
  * Scala实现构造器
  *   在类后面的参数列表为主构造器参数
  */
class ConstructorClass(val name: String, val use: String) {
  private var value = 0

  // 辅助构造器
  def this(name: String, use: String, value: Int) {
    //调用主构造器
    this(name, use)
    this.value = value
  }

  def increment(step: Int): Unit = {
    value += step
  }

  def current(): Int = {
    value
  }

  def info(): Unit = {
    printf("此为%s，作用是%s\n", name, use)
  }
}

object ConstructorTest {
  def main(args: Array[String]): Unit = {
    val myClass = new ConstructorClass("主构造器", "构造一个属性已赋值的对象")
    myClass.info()

    val myClass2 = new ConstructorClass("辅助构造器", "构造一个属性已赋值的对象", 9)
    printf("此为%s，作用是%s，属性值为%d", myClass2.name, myClass2.use, myClass2.current())
  }
}
