// Q9. Write a Scala program to create a new string with the last char added at the front and back of a given string of length 1 or more.
object scala_basic{
  def test(x:String):String={
    val len = x.length 
    x.charAt(len-1).toString+x+x.charAt(len-1).toString
  }
  
  def main(args:Array[String]):Unit={
    println(test("Hello"))
  }
}
