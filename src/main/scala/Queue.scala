import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt
trait Queue {
  def dequeue( list: ListBuffer[Int]): Unit = {
    list.remove(0)
  }
  def enqueue(list: ListBuffer[Int]): Unit = {
    println("Enter a value to enqueue: ")
    var num=readInt()
    list.addOne(num)
  }
}