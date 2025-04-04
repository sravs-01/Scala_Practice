// Q27. Write a Scala program to check if a given string is a palindrome using if/else statements and pattern matching.
object palindromechecker{
  def main(args:Array[String]){
    val str: String="madam"
    
    val isPalindrome :Boolean = checkpalindromeifelse(str)
    if(isPalindrome)
    {
      println("yes")
    }
    else
    {
      println("no")
    }
  }
  
  def checkpalindromeifelse(str:String):Boolean={
    val reversed=str.reverse
    if(reversed==str)
    {
      true
    }
    else{
      false
    }
  }
  
  def checkpalindromematch(str:String):Boolean={
    str.reverse match {
      case `str`=> true
      case _ => false
    }
    
  } 
}