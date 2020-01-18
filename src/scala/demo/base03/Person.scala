package scala.demo.base03

class Person {
  private  val id = Person.newPersonId()
  private var name = ""
  def this(name: String) {
    this()
    this.name = name
  }
  def info() {printf("个人编号：%d，姓名：%s\n", id, name)}
}

object Person {
  /**
    * 一个人的身份编号
    */
  private var lastId = 0
  private def newPersonId() = {
    lastId += 1
    lastId
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Person("张三")
    val person2 = new Person("李四")
    person1.info()
    person2.info()
  }
}