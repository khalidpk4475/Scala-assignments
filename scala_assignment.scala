object Main1 {

def main(args: Array[String]): Unit = {
  //Data Types and Variables

  /*  Byte and Char
    A Byte is a signed 8-bit value that can hold values
    ranging from -128 to 127. A Char is a
    16-bit value and it’s used to store human-readable
    characters.*/

  val b1: Byte = 100
  val c1: Char = 'A'

  /*Integer, Long and Short
  An Integer is a 32-bit value and is central to
  any numeric representation in Scala. The Long and
  Short types are similar to Integer.
   */
  val l1: Long = 65536
  val i3: Int = 32768
  val s1: Short = 32767
  // val s2: Short = 32768 (will not compile)
  /*Booleans
Boolean values are the simplest. Unsurprisingly,
 we can assign either of two values to a variable of
 Boolean type
 */
  val trueVal = true
  val falseVal = !true
  val falseValOtherWay = !true

  /*Float and Double
Float and Double types are used to hold real numbers,
associated with precisions
 */

  val f1 = 12.05f // 'f' signifies that it is a Float
  val d1 = 12.3495067 // inferred as a Double
  val d2 = 12.3495067D // 'D' signfies a Double, but is optional

  /*String interpolation allows the evaluation of
a literal string containing placeholders, yielding a
string in which all the placeholders are replaced by
the corresponding values

The s interpolator allows the usage of our variables
directly in the literal string
 */
  val age = 30
  val agePresentation = s"I am $age" // "I am 30"
  println(agePresentation)

  val price = 30

  println(s"It is about $$price") //We can escape the special character $ with a double $

  //f Interpolato The f interpolator is type-safe
  val height = 1.7d
  val name = "Michele"

  println(f"My name is $name%s. I am $age%d years old and $height%1.2f meters tall")

  /* Raw Interpolator
  The raw interpolator doesn’t support the escaping
  of literals, but works very similarly to s and f
 */

  println(raw"My name is $name%s. \n $agePresentation and $height%1.2f meters")

//if Elseif Else Expression
  val number = 10
  if (number == 0) {
    printf("Number is zero")
  } else if (number > 100) {
    printf("Number is greater than 100")
  } else {
    printf("Number is %d", number)
  }
//For Loops: a for loop is a control flow statement. It allows executing some code repeatedly
  for (num <- 1 until 5){
    println(num)
  }
  for (num <- 1 to 5) {
    println(num)
  }
//while and do while loop
  var a = 10
  while (a < 20){
    println("Value of a: " + a)
    a +=1
  }

  do{
    println("Value of a: " + a)
    a+=1
  }while (a<20)

//Match expressions
  val i =1
  i match{
    case 1 => println("January")
    case 2 => println("February")
    case 3 => println("March")
    case 4 => println("April")
    case 5 => println("May")
    case 6 => println("June")
    case 7 => println("July")
    case 8 => println("August")
    case 9 => println("September")
    case 10 => println("October")
    case 11 => println("November")
    case 12 => println("December")
    case _ => println("Invalid Month ")
  }
//Function
  def add(number1 : Int, number2 : Int) : Int = {
    return number1 + number2
  }
  var result = add(20,10)
  println(result)

// Anonymous Function
  val sum = (x : Int, y : Int) => x + y
  result = sum(20, 30)
  println(result)

//Default value function
  def add1(number1: Int = 50, number2: Int = 100): Int = {
    return number1 + number2
  }

  var result1 = add1()
  println(result1)

//Higher order function
  /* a function is higher-order if it meets one or both of the following conditions:
  it takes one or more functions as parameters
  it returns a function*/
  val names = Seq("Alex Ferguson", "Bobby Charlton", "Frank Lampard")
  def prefixWithSir(name: String) = "sir " + name

  val sirNames = names.map(prefixWithSir)
  println(sirNames)

/*A partial function is a function applicable to a subset
of the data it has been defined for.
For example, we could define a function on the Int domain
that only works on odd numbers.*/
  val squareRootImplicit: PartialFunction[Double, Double] = {
    case x if x >= 0 => Math.sqrt(x)
  }

/* A closure is a function, whose return value depends
on the value of one or more variables declared outside this
function
 */
  var factor = 3
  val multiplier = (i: Int) => i * factor
  println(multiplier(10))

/* Currying
  Currying is the process of converting a function with
  multiple arguments into a sequence of functions that
  take one argument. Each function returns another
  function that consumes the following argument
 */
  val curriedSum: Int => Int => Int = x => y => x + y
  println(curriedSum(1)(2))

// String is a muteable object in scala, which means it can not be modified once it daclared
//Creating a string
  var greeting = "Hello, World" //or var greeting.String = "Hello World"
  var greeting1 = " Greeting1"
  println(greeting)

  println(greeting.length) //to get length of the string
  println(greeting.concat(greeting1)) //to concatenate two strings

//Arrays
  var z:Array[String] = new Array[String](3) //to create new array
  var z1 = new Array[String](3)
  var z2 = Array("john", "Nuh", "zen")
  for (x <- z2){ //to get all element of array
    println(x)
  }

  // List of Strings
  val fruit: List[String] = List("apples", "oranges", "pears")

  // List of Integers
  val nums: List[Int] = List(1, 2, 3, 4)

  // Empty List.
  val empty: List[Nothing] = List()
  for (x <- fruit){
    println(x)
  }
  println(fruit.head) // to get first element of array
  println(fruit.tail) // to get all  element of array except the first
  println(fruit.isEmpty) // to check if the array is empty
  println(List.concat(fruit, nums)) // to concatinate two lists

// Set
  var s = Set(1,3,5,7) // to create a set
  println(s)
  println(s.head) // to get first element of set
  println(s.tail) // to get all  element of set except the first
  println(s.isEmpty) // to check if the set is empty

// Map is a collection of key/value pair
  val emp = Map("Name" -> "John", "age" -> "25")
  println(emp)
  println(emp.keys) // to get keys
  println(emp.values) // to get values

//Scala option is a container for zero or one element of a given type
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
  println("capitals.get( \"France\" ) : " + capitals.get("France"))
  println("capitals.get( \"India\" ) : " + capitals.get("India"))

// map, flatMap, flatten and filter (Higher-order Methods)
  val name1 = Seq("Nidhi", "Singh")

  // Applying map()
  val result2 = name1.map(_.toLowerCase)
  println(result2)

  // Applying flatten() now,
  val result3 = result2.flatten
  println(result3)

  //flaten
  val list = List(List(1, 2), List(3, 4))
  //apply operation
  val result4 = list.flatten
  //print result
  println(result4)

// reduce
  val l = List(2, 5, 3, 6, 4, 7)
  // returns the largest number from the collection
  println(l.reduce((x, y) => x max y))

// fold
  val numbers = List(5, 4, 8, 6, 2)
  numbers.fold(0) { (z, i) =>
    a + i
  }

}
}




