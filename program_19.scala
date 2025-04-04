// Q19.  Write a Scala program to find the larger value from two positive integer values in the range 20..30 inclusive, or return 0 if neither is in that range.
object scala_basic{
  def test(x:Int,y:Int):Int={
    var k=0
    if(x>y){
      k=x
    }
    else
    {
      k=y
    }
    if((20<=k) && (k<=30))
    {
      return k
    }
    else
    {
      return 0
    }
  }
  
  def main(args:Array[String]):Unit=
  {
    println(test(28,28))
  }
}
