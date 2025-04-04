// Q35. Write a Scala function to find the maximum element in an array.
object ArrayMax {
  def main(args: Array[String]): Unit = {
    val numbers: Array[Int] = Array(1, 2, 3, 4, 5)
    val result: Int = max_array(numbers)
    println(s"Maximum value in array is: $result") 
  }

  def max_array(numbers: Array[Int]): Int = {
    var maxVal = numbers(0) 
    for (num <- numbers) {
      if (num > maxVal) {
        maxVal = num 
      }
    }
    maxVal 
  }
}
