// Q30.	Write a Scala function to calculate the factorial of a given number.
object factorial_number{
  def main(args:Array[String]):Unit={
    val number : Int = 5
    val result : Int = factorial(number)
    println("The result is: "+result)
  }
  
  def factorial(number:Int):Int={
    var count : Int =1
    var new_number : Int = number
    while(new_number!=0)
    {
      count=count*new_number
      new_number -=1
    }
    count
  }
}
