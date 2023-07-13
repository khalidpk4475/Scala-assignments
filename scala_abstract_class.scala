/*
Abstraction is the process to hide the internal details and showing only the functionality.
In Scala, abstraction is achieved by using an abstract class.
In Scala, an abstract class is constructed using the abstract keyword.
It contains both abstract and non-abstract methods and cannot support multiple inheritances.
A class can extend only one abstract class.
Syntax:

abstract class class_name
{
// code..
}
 
 Scala program to illustrate how to
 create an abstract class
*/

// Abstract class
abstract class myauthor
{
	
	// abstract method
	def details()
}

// GFG class extends abstract class
class GFG extends myauthor
{
	def details()
	{
		println("Author name: Ankita Saini")
		println("Topic name: Abstract class in Scala")
	}
}

object Main
{
	// Main method
	def main(args: Array[String])
	{
		// objects of GFG class
		var obj = new GFG()
		obj.details()
	}
}
