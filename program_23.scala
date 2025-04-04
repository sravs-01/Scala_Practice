// Q23.	Write a Scala program to find the factorial of a given number using a while loop.
object numbercheck {
  def main(args:Array[String]):Unit={
    val number: Int =4
    var factorial: Long=1
    var i:Int=number
    
    while(i>0)
    {
      factorial *=i
      i-=1
    }
    
    println(s"The factorial of $number is: $factorial")
  }
}
