// Q16. Write a Scala program to convert the last 4 characters of a given string in upper case. If the length of the string has less than 4 then uppercase all the characters.
object scala_basic{
  def test(x:String):String={
    val len=x.length
    if(len<=4){
      x.toUpperCase
    }
    else
    {
      x.substring(0,len-4)+x.substring(len-4,len).toUpperCase
    }
  }
  
  def main(args:Array[String]):Unit={
    println(test("abcd"))
  }
}
