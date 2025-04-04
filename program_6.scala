// Q6. Write a Scala program to remove the character in a given position of a given string. The given position will be in the range 0...string length -1 inclusive.
object scala_basic{
  def test(x:String,n:Int):String={
    x.take(n)+x.drop(n+1)
  }
  
  def main(args:Array[String]):Unit={
    println(test("Hello",1))
  }
}
