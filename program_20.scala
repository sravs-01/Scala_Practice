// Q20.	Write a Scala program to check if a given number is positive, negative, or zero using if/else statements.
object numbercheck {
  def test(x:Int):Unit={
    if (x>0)
    {
      println("Positive Number")
    }
    else if(x<0)
    {
      println("Negative Number")
    }
    else if(x==0)
    {
      println("Number is zero")
    }
  }
  
  def main(args:Array[String]):Unit={
    test(0)
  }
}
