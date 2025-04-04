// Q36. Write a Scala function to calculate the power of a number.
object power_number{
  def main(args:Array[String]):Unit={
    val number : Int = 2
    val power :Int = 3
    val result : Int = power_func(number,power)
    println("The result of the number is: "+result)
  }
  
  def power_func(number:Int, power:Int):Int={
    var i : Int = 0
    var ans : Int = 1
    while(i<power)
    {
      ans = ans * number
      i+=1
    }
    ans
  }
}
