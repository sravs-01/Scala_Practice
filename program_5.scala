// Q5. Write a Scala program to create a new string where 'if' is added to the front of a given string. If the string already begins with 'if', return the string unchanged.
object scala_basic{
  def test(x:String):String={
    if(x.startsWith("if")) x else "if" + x
  }
  
  def main(args:Array[String]):Unit={
    println(test("hello"))
  }
}
