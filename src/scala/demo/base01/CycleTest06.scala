package scala.demo.base01

object CycleTest06 {
  def main(args: Array[String]): Unit = {
//    ifelseTest01()
//    whileTest()
    forTest()
  }

  /**
    * 基础用法和java相同，唯一一点不同之处是：
    *   if表达式的值可以赋值给变量
    */
  def ifelseTest01() : Unit = {
    var i = 6
    if (i > 0) {
      i -= 1
    } else {
      i -= 2
    }
    printf("处理后的i-> %d\n", i)
    val j = if(i == 4) i else 0
    printf("赋值后的j-> %d\n", j)
  }

  def whileTest() : Unit = {
    var i = 9
    while (i > 0) {
      i -= 1
    }
    printf("while循环处理后的i->%d\n", i)

    do {
      i -= 1
    } while (i < 0)
    printf("do-while循环处理后的i->%d\n", i)
    // 2147483647 = 2^31 - 1，也就是Int的取值范围的最大值
    printf("处理后的i-> %d\n", - 2147483648 - 1)
    val i2 : java.lang.Integer =  -2147483648
    printf("处理后的i2-> %d", i2 - 1)
  }

  /**
    * for循环语句格式如下;
    *   for(变量 <- 表达式) 语句块
    */
  def forTest() : Unit = {
    for (i <- 1 to 5) print(i + " ");println()
    // 设置步长
    for (i <- 1 to 5 by 2) print(i + " ");println()
    // Scala中可以使用“守卫”，过滤所需的结果，如下面过滤出偶数
    for (i <- 1 to 10 if i % 2 == 0) print(i + " ");println()
    // Scala中支持多个生成器，以分号隔开，类似于java中的循环嵌套
    for (i <- 1 to 5; j <- 1 to 3) print(i*j + " ");println()
    // Scala中可以将循环的结果封存在一个集合中，使用关键字：yield
    // yield：会生成一个缓冲区，将每次循环迭代的值记录下来，结束循环时返回结果集合
    val a = for (i <- 1 to 10 if i % 2 == 0) yield i
    println(a)
  }
}
