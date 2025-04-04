// Q26.	Write a Scala program to find the sum of all elements in an array using a for loop.
object numbercheck {
  def main(args:Array[String]):Unit={
    val numbers: Array[Int] = Array(1, 2, 3, 4, 5)
    var sum:Int =0 
    for(number<-numbers)
    {
      sum += number
    }
    println(sum)
  }
}
