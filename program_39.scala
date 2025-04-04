// Q39. Write a Scala function to check if a given list is sorted in ascending order.
object ascending{
  def main(args:Array[String]):Unit={
    val list1 = List(1,2,3,4,5,6)
    val list2 = List(4,2,5,1,6,3)
    println("List1 is sorted is "+sortedascending(list1))
    println("List2 is sorted is "+sortedascending(list2))
  }
  
  def sortedascending(lst:List[Int]):Boolean={
    lst==lst.sorted
  }
}
