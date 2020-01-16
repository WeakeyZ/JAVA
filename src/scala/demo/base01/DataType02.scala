package scala.demo.base01

/**
  * https://www.cnblogs.com/PerkinsZhu/p/7868012.html
  * https://www.jianshu.com/p/190851442cf5
  */
object DataType02 {
  /**
    * scala常用类型有：
    * Byte，Char，Short，Int，Long，Float，Double，Boolean
    *
    * @param args 参数
    */
  def main(args: Array[String]): Unit = {
//    dataTest()
//    dataTest2()
    dataTest3()
  }

  def dataTest(): Unit = {
    val b = 127
    val b2 : Byte = 127      //  8位有符号补码，取值范围：[-128, 127]
    val s : Short = 255      // 16位有符号补码，取值范围：[-32768, 32767]
    val i : Int = 1111       // 32位有符号补码，取值范围：[-2147483648,2147483647]
    val l : Long = 1111111L  // 64位有符号补码，取值范围：[-9223372036854775808, 9223372036854775807]
    val f : Float = 2.10f    // 32位有符号补码
    val d : Double = 2.1     // 64位有符号补码

    println("默认数值定义的类型：" + b.getClass) //int
    println("显式定义一个Byte：" + b2.getClass) //byte
    println("Byte通过运算操作后的数值类型：" + (b2 + 1).getClass)  //int，通过运算操作，数值类型的参数会自动转换为int
    println("Short通过运算操作后的数值类型：" + (s + 1).getClass)  //int，通过运算操作，数值类型的参数会自动转换为int
    println("Int通过运算操作后的数值类型：" + (i + 1).getClass)    //int，通过运算操作，数值类型的参数会自动转换为int
    println("Long通过运算操作后的数值类型：" + (l + 1).getClass)   //long，通过运算操作，数值类型的参数会自动转换为int
    println("Float通过运算操作后的数值类型：" + (f + 1).getClass)  //Float，通过运算操作，数值类型的参数会自动转换为int
    println("Double通过运算操作后的数值类型：" + (d + 1).getClass) //Double，通过运算操作，数值类型的参数会自动转换为int

    println("====================================================================")

  }

  def dataTest2(): Unit = {
    val c = 'a'
    val c2 = "aa"
    val c3 : Char = 'b'
    val c4 = "bb"
    println("默认定义字符的类型(单引号)：" + c.getClass)       //char
    println("默认定义字符的类型(双引号)：" + c2.getClass)      //class java.lang.String
    println("两个字符通过+运算后的类型：" + (c + c3).getClass) //int，将字符转成ASCII码进行+运算，再转成十进制
    println("两个字符通过+运算后的值：" + (c + c3))            //97 + 98 = 195，字符a的ASCII码转换为十进制为97，字符b为98

    val c5 = c2 + c4
    println("两个字符串通过+运算后的值：" + c5)                //aabb，字符串拼接
    println("两个字符串通过+运算后的类型：" + c5.getClass)     //aabb，字符串拼接
    println("字符串获取子字符串：" + c5.apply(0))             //a，调用此方法获取单个字符
    println("字符串获取子字符串：" + c5(0))                   //a，可以简写
    println("字符串获取子字符串类型：" + c5(0).getClass)      //char
    println("====================================================================")
  }

  def dataTest3() : Unit = {
    // Unit 表示无值，与Java中的void等同
    val u :Unit = "s"
    val u2 : Unit = ()
    println("获取Unit的类型：" + u.getClass) // void
    println("获取Unit的实例值：" + u)        // ()，打印的就是()

    // Null 表示空值或者空引用，唯一实例：null，null可以赋值给AnyRef，而不可以给AnyVal赋值，即val n:Int = null
    val n : Null = null

    // int i = (int)((Integer)null) 这种写法IDE编译成功，但是运行会报错，空指针异常
    // 注asInstanceOf不是替代原值，而是返回一个新的值
    val n2 = null.asInstanceOf[Integer].asInstanceOf[Int] //将Null类型转换位java.lang.Integer在转换为Int类型
    // n.getClass报错，空指针异常

    println("获取Null的实例值：" + n)        // ()，打印的就是()
    println("模拟一个拆箱操作：" + n2)       // 0

    // 在java中int和Integer为两种类型，只是java提供了自动拆装箱
    // 在scala中只有Int，值为null的Integer通过asInstanceOf[Int]时被当作一个未被初始化的Int对待，返回一个Int的默认值

    /**
      * Any 所有类型的超类，任何实例都属于Any类型
      * AnyRef 所有引用类型的超类
      * AnyVal 所有值类型的超类
      * Nothing 所有类型的子类型，表示没有值，也没有实例
      *                           Any
      *                      |           |
      *                    AnyRef      AnyVal
      *                      |           |
      *                   引用类型     基本类型
      *                            |
      *                         Nothing
      */
  }
}
