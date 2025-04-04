// Q13. Write a Scala program to check whether one of the given temperatures is less than 0 and the other is greater than 100.
object scala_basic{
  def test(x:Int,y:Int):Boolean={
    if((x<0 && y>100) || (x>100 && y<0))
    {
      true
    }
    else
    {
      false
    }
  }
    
  
  def main(args:Array[String]):Unit={
    println(test(-1,120))

  }
}
