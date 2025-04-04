// Q29.	Write a Scala program to find the largest element in an array using pattern matching.
object MaxElement {
  def main(args: Array[String]): Unit = {
    val numbers: Array[Int] = Array(1, 2, 3, 4, 5)
    
    val maxValue = findMax(numbers.toList) 
    println("Max is " + maxValue)
  }

  def findMax(lst: List[Int]): Int = lst match {
    case Nil => throw new NoSuchElementException("Empty list has no max value")
    case head :: Nil => head  
    case head :: tail =>
      val maxTail = findMax(tail) 
      if (head > maxTail) head else maxTail
  }
}
