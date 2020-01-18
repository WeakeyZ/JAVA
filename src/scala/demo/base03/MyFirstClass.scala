package scala.demo.base03

/**
  * 本示例：定义一个类，且调用类中的方法
  *   class关键字：在一个class被new出来之前，所有class的属性和方法都无法访问
  *   object关键字：而一个object是默认是静态的，注意Scala没有static关键字
  *   所以，只有object的main方法才有Java中的main方法作用，因为可以直接调用
  */
class MyFirstClass {

  private var value = 0
  // 无返回类型，Unit也可以省略，默认
  def increment() {value += 1}
  // 当函数只有一个表达式的情况下可以省略{}
  def current(): Int = value

}

object NewMyClass {
  def main(args: Array[String]): Unit = {
    val clazz = new MyFirstClass
    clazz.increment()
    // 无参方法，调用时可以省略方法的（）
    clazz.increment
    println(clazz.current())
  }
}
