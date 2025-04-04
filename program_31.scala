// Q31.	Write a Scala function to check if a given number is prime.
object prime_number{
  def main(args:Array[String]):Unit={
    val number : Int = 7
    val result : Boolean = prime(number)
    if (result==true)
    {
      println("The number is prime")
    }
    else
    {
      println("The number is not prime")
    }
  }
  
  def prime(number:Int):Boolean={
    var new_number : Int = number
    var i : Int = 2
    var flag : Boolean = false
    while(i<=(new_number/2))
    {
      if((new_number%i)==0)
      {
        flag = true
      }
      i+=1
    }
    if (flag==true)
    {
      false
    }
    else
    {
      true
    }
  }
}
