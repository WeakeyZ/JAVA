package scala.demo.base01

/**
  * 操作符测试
  */
object operatorStr04 {
  def main(args: Array[String]): Unit = {
    operatorStrTest()
    operatorStrTest2()
  }

  /**
    * 操作符中
    *  a 方法 b 等价于 a .方法 (b)
    *  而且+，-，*，%，/都是Int类的方法
    * @return 操作符运算实例结果
    */
  def operatorStrTest(): Unit = {
    var i = 5
    i = i + 1
    i = i .+ (1)
    //scala中，没有++，--的操作符，替换方案为+=， -=
    i += 1
    println("计算结果->" + i)
  }

  /**
    * Range实现数值序列
    * @return 操作符运算实例结果
    */
  def operatorStrTest2(): Unit = {
    val i = 1 to 5
    val i2 = 1 .to (5)
    val i3 = 1 to 10 by 2
    val i4 = 1 until 5
    // range支持Long、Float、Double、Char、BigInt和BigDecimal等数据类型
    // 其中BigDecimal为scala.math.BigDecimal，非java.math.BigDecimal
    val c = 'a' to 'f'
    // 浮点数会出现精度问题
    val f = 1.0f to 2.0f by 0.2f
    val d = 1.0 to 2.0 by 0.1
    // 使用BigDecimal可以避免浮点数精度问题
    val b1 : BigDecimal = 1.0
    val b2 : BigDecimal = 2.0
    val b3 : BigDecimal = 0.1
    val b = b1 to b2 by b3
    println("使用range创建的数值序列->" + i)
    println("数值序列使用.方法调用->" + i2)
    println("为数值序列设置步长->" + i3)
    println("使用until在非闭区间设置数值序列->" + i4)
    println("range还支持Float->" + f)
    println("range还支持Double->" + d)
    println("range还支持Char->" + c)
    println("range还支持BigDecimal->" + b)
  }
}
