// Q10. Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.
object scala_basic{
  def test(x:Int):Boolean={
    if (x%3==0 || x%7==0)
    {
      true
    }
    else
    {
      false
    }
  }
  
  def main(args:Array[String]):Unit={
    println(test(37))
  }
}
