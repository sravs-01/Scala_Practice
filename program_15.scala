// Q15.  Write a Scala program to create a new string which is n (non-negative integer ) copies of a given string.
object scala_basic{
  def test(x:String,y:Int):String={
    if(y==0)
    {
      ""
    }
    else
    {
      x *y
    }
  }
  
  def main(args:Array[String]):Unit={
    println(test("Scala",2))
  }
}
