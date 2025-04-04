// Q37. Write a Scala function to check if a given number is even.
object even_number{
  def main(args:Array[String]):Unit={
    val number : Int = 7
    val result : Boolean = even_func(number)
    if(result)
    {
      println("Given number is even")
    }
    else
    {
      println("Given number is odd")
    }
  }
  
  def even_func(number : Int):Boolean={
    if(number%2==0)
    {
      true
    }
    else
    {
      false
    }
    
  }
}
