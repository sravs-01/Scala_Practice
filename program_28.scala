// Q28. Write a Scala program to count the number of vowels in a given string using if/else statements and pattern matching.
object vowels{
  def main(args:Array[String]):Unit={
    val str : String ="abc"
    val count_ifelse : Int = countvowelsifelse(str)
    val count_match : Int = countvowelsmatch(str)
    
    println("through if/else: "+count_ifelse)
    println("through match: "+count_match)
  }
  
  def countvowelsifelse(str:String):Int={
    var count_a:Int=0
    for(c<-str){
      if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
      {
        count_a +=1
      }
    }
    count_a
  }
  
  def countvowelsmatch(str:String):Int={
    var count_b:Int=0
    for(c<-str)
    {
      c match{
        case 'a' | 'e' | 'i' | 'o' | 'u' => count_b+=1
        case _ => 
      }
    }
    count_b
  }
}
