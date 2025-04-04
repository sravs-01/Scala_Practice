// Q7. Write a Scala program to exchange the first and last characters in a given string and return the new string.
object scala_basic{
  def test(x:String):String={
    val len = x.length 
    if(len<=1){
      x
    }
    else{
      x.charAt(len-1).toString+x.substring(1,len-1)+x.charAt(0).toString
    }
  }
  
  def main(args:Array[String]):Unit={
    println(test("Hello"))
  }
}
