// Q18. Write a Scala program to check whether a given character presents in a string between 2 to 4 times.
object scala_basic{
  def test(x:String,y:Char):Boolean={ 
    var count = 0
    for(i<-x.indices){
      if(x(i)==y)
      {
        count+=1
      }
    }
    if((count>=2) && (count<=4))
    {
      true
    }
    else
    {
      false
    }
  }
  
  def main(args:Array[String]):Unit=
  {
    println(test("Zazz",'z'))
  }
}
