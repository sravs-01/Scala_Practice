// Q40. 1.	Write a Scala program that creates a class called Person with properties like name, age and country. Implement methods to get and set properties.
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


object personapp{
  def main(args:Array[String]):Unit={
    val person = new Person("Sravani",20,"India")
    
    println("Original Data")
    println(person.getName)
    println(person.getage)
    println(person.getcountry)
    
    person.setname("Vicky")
    person.setage(24)
    person.setcountry("US")
    
    println("Updated Data")
    println(person.getName)
    println(person.getage)
    println(person.getcountry)
}