// Q32. Write a Scala function to calculate the sum of digits in a given number.
object digits_sum{
  def main(args:Array[String]):Unit={
    val numbers : Int = 12345
    val result : Int = number_sum(numbers)
    println("The sum of digits in the number is: "+result)
  }
  
  def number_sum(numbers:Int):Int={
    var count : Int = 0
    var new_number : Int = numbers
    while(new_number>0)
    {
      var rem = new_number%10
      count=count+rem
      new_number=new_number/10
      
    }
    count
  }
}
