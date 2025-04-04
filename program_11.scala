// Q11.  Write a Scala program to create a new string taking the first 3 characters of a given string and return the string with the 3 characters added at both the front and back. If the given string length is less than 3, use whatever characters are there.
object scala_basic{
  def test(x:String):String={
    val len=x.length
    
    if (len<3)
    {
      x+x+x
    }
    else
    {
      x.substring(0,3)+x+x.substring(0,3)
    }
  }
    
  
  def main(args:Array[String]):Unit={
    println(test("a"))
    
  }
}