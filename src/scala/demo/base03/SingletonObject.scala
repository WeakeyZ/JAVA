package scala.demo.base03

/**
  * 单例对象，利用的是object的属性是静态的
  */
object SingletonObject {
  private var lastId = 0
  def newPersonId():Int = {
    lastId += 1
    lastId
  }

  def main(args: Array[String]): Unit = {
    printf("这是一个单例对象：%d\n", SingletonObject.newPersonId())
    printf("这是一个单例对象：%d\n", SingletonObject.newPersonId())
    printf("这是一个单例对象：%d\n", SingletonObject.newPersonId())
  }

}
