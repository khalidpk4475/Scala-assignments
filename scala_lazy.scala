
/*
Lazy evaluation or call-by-need is a evaluation strategy where an expression isn’t evaluated
until its first use i.e to postpone the evaluation till its demanded.
 */


object Main
{
  // Main method
  def main(args: Array[String])
  {
    //Without lazy:
    val geeks = List(1, 2, 3, 4, 5)
    val output = geeks.map(l=> l*2)
    println(output)

    //with lazy:
    val geeks1 = List(1, 2, 3, 4, 5)
    lazy val output2 = geeks1.map(l => l * 5)
    println(output2)
  }
}