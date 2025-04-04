// Q34. Write a Scala function to check if a given string is a palindrome.
object string_reverse
{
  def main(args:Array[String]):Unit={
    val str : String = "aba"
    val result : Boolean = palindrome(str)
    if(result)
    {
      println("palindrome")
    }
    else
    {
      println("Not a palindrome")
    }
  }
  
  def palindrome(str: String):Boolean={
    val rev_str = str.reverse
    if(str==rev_str)
    {
      true
    }
    else
    {
      false
    }
  }
}
