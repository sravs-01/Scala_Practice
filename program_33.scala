// Q33. Write a Scala function to reverse a given string.
object string_reverse
{
  def main(args:Array[String]):Unit={
    val str : String = "abc"
    println("The original string is: "+str)
    val result = str.reverse
    println("The reversed string is: "+result)
  }
}
