// Q4. Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
object sum{
  def test(x:Int,y:Int):Boolean={
    if(x==30 || y==30)
    {
      true
    }
    else if(x+y==30)
    {
      true
    }
    else
    {
      false
    }
}
  def main(args:Array[String]):Unit={
    println(test(30,12))
    println(test(21,9))
    println(test(30,0))
    println(test(20,12))
  }
}
