/** Scala Redbook : Chapter 2 */

object MyModule {
  def abs(n : Int) : Int = {
    if(n < 0) -n
    else n
  }

  def formatAbs(x : Int) : String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args : Array[String]) : Unit = {
    println(formatAbs(-42))
  }
}
