package scala.demo.base01

import java.io.PrintWriter

object IoTest05 {
  def main(args: Array[String]): Unit = {
//    outTest()
    inTest()
  }

  /**
    * 在桌面输出生成文件aa.text
    */
  def outTest() : Unit = {
    val out = new PrintWriter("C:\\Users\\Administrator\\Desktop\\aa.txt")
    for (i <- 1 to 6) {
      out.print(i)
    }
    out.println()
    out.println("这是我输出的第一个文件")
    out.close()
  }

  import scala.io.Source
  def inTest() : Unit = {
    // 此处的Source是Scala.io.Source
    val inputFile = Source.fromFile("C:\\Users\\Administrator\\Desktop\\aa.txt")
    val lines = inputFile.getLines()
    for (line <- lines)
      println(line)
  }


}
