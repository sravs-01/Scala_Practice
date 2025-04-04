// Q12. Write a Scala program to check whether a given string starts with 'Sc' or not.
object scala_basic{
  def test(x:String):Boolean={
    if(x.startsWith("Sc"))
    {
      true
    }
    else
    {
      false
    }
  }
    
  
  def main(args:Array[String]):Unit={
    println(test("Scala"))
    
  }
}
