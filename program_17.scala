// Q17. Write a Scala program to check whether two given positive integers have the same last digit.
object scala_basic{
  def test(x:Int,y:Int):Boolean={
    Math.abs(x%10)==Math.abs(y%10)
  }
  
  def main(args:Array[String]):Unit=
  {
    println(test(12,51))
  }
}
