// Q21.	Write a Scala program to find the maximum of two given numbers using if/else statements.
object numbercheck {
  def test(x:Int,y:Int):Unit={
    if(x>=y)
    {
      println("max is ",x)
    }
    else
    {
      println("max is ",y)
    }
  }
  
  def main(args:Array[String]):Unit={
    test(2,3)
  }
}
