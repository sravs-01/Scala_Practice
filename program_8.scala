// Q8.  Write a Scala program to create a new string which is 4 copies of the 2 front characters of a given string.If the given string length is less than 2 return the original string.
object scala_basic{
  def test(x:String):String={
    val len = x.length 
    if(len<2){
      x
    }
    else{
      x.substring(0,2) * 4
    }
  }
  
  def main(args:Array[String]):Unit={
    println(test("Hello"))
  }
}
