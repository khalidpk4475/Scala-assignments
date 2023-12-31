/*
A class is a blueprint for objects. Once you define a class, you can create objects from the
class blueprint with the keyword new. Through the object you can use all functionalities of the defined class.
*/

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }
}

object Demo {
  def main(args: Array[String]) {
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);
  }
}