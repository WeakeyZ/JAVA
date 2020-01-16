package scala.demo.base01

/**
  * Scala编程开始-Hello World
  */
object HelloWorld01 {

  /** def 函数名(参数1:参数类型 [,参数2:参数类型]) : 返回类型 {
    *   方法体
    *   [return 返回值]
    * }
    * 注意：return可以省略
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("Hello World！")
    println(definition())
    println(definition2())
    println(definition3())
  }

  def definition():String = {
    // val修饰的常量，声明时就必须被初始化，而且初始化后不可被重新赋值，所以val修饰的变量含有不可变的特性
    // 注意：与Java中的final区别：
    //      final表示子类不能重载（改变）此变量的值，而val只是运行时不能改变当前变量的值
    // 故存在final val的写法
    val str : String = "Hello World again！"
    str
  }

  def definition2():String = {
    // var修饰的变量，声明是就必须被初始化，初始化后可以被重新赋值
    var str : String = "Hello World again！"
    str = "Hello World And GoodBye!"
    str
  }

  def definition3():String = {
    // scala具有语义推断，所以数据类型可以省略
    val str = "Hei, I'm coming back!"
    // String使用的是java的lang包实现的
    // 默认情况下，Scala会引入java.lang._,scala._,scala.Predef._三个包，所以包路径可以省略，即java.lang可以省略
    val str2 : java.lang.String = "I feel so good!"
    str + str2
  }

}
