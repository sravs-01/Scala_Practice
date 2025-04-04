// Q24.	Write a Scala program to print the Fibonacci series up to a given number using a while loop.
object numbercheck {
  def main(args:Array[String]):Unit={
    val t0:Int=0
    val t1:Int=1
    var prev :Int=t0
    var curr :Int=t1

    println(prev)
    println(curr)
    
    val number:Int = 5
    var i:Int=2
    while(i<number)
    {      
      val next=curr+prev
      println(next)
      prev=curr
      curr=next
      i+=1
    }
  }
}
