// Q14. Write a Scala program to check two given integers whether either of them is in the range 100..200 inclusive
object scala_basic{
  def test(x:Int,y:Int):Boolean={
    if((x>=100 && x<=200) || (y>=100 && y<=200))
    {
      true
    }
    else
    {
      false
    }
  }
  
  def main(args:Array[String]):Unit={
    println(test(105,190))
  }
}
