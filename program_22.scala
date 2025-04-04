// Q22.	Write a Scala program to check if a given number is even or odd using if/else statements.
object numbercheck {
  def test(x:Int):Unit={
    if(x%2==0)
    {
      println("Even number")
    }
    else
    {
      println("Odd number")
    }
  }
  
  def main(args:Array[String]):Unit={
    test(9)
  }
}
