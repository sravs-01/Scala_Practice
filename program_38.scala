// Q38. Write a Scala function to check if a given number is a perfect square.
object perfect_square{
  def main(args:Array[String]):Unit={
    val number : Int = 25
    val result : Boolean = perfect_func(number)
    if(result)
    {
      println("perfect square")
    }
    else
    {
      println("not a perfect square")
    }
  }
  
  def perfect_func(number:Int):Boolean={
    val sqrt=math.sqrt(number)
    sqrt*sqrt==number
  }
}
