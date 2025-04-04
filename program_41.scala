// Q41. 2.	Write a Scala program that creates a subclass Student that extends the Person class. Add a property called grade and implement methods to get and set it.
class Person(var name:String, var age:Int, var country:String){
  def getName : String = name
  def getage : Int = age
  def getcountry : String = country
  
  def setname(newname : String):Unit={
    name=newname
  }
  
  def setage(newage : Int):Unit={
    age=newage
  }
  
  def setcountry(newcountry : String):Unit={
    country=newcountry
  }
}

class Student(name:String, age:Int, country:String, var grade: String)
extends Person(name,age,country)
{
  def getgrade : String = grade
  def setgrade(newgrade:String):Unit={
    grade=newgrade
  }
}
object personapp{
  def main(args:Array[String]):Unit={
    val student = new Student("Saturnino Nihad", 18, "USA", "A")

    println("Original Student:")
    println(s"Name: ${student.getName}")
    println(s"Age: ${student.getage}")
    println(s"Country: ${student.getcountry}")
    println(s"Grade: ${student.getgrade}")

    student.setname("Albino Ellen")
    student.setage(20)
    student.setcountry("Canada")
    student.setgrade("B")

    println("\nUpdated Student:")
    println(s"Name: ${student.getName}")
    println(s"Age: ${student.getage}")
    println(s"Country: ${student.getcountry}")
    println(s"Grade: ${student.getgrade}")
    
    
  }
}