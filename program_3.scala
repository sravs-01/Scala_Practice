// Q3. Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.
object sum{
  def test(x:Int):Int={
    if(x>51)
    {
      (3*(x-51))
    }
    else{
      (51-x)
    }
  }
  def main(args:Array[String]):Unit={
    println("Result: ",test(60))
    println("Result: ",test(40))
  }
}
