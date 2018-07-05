/** Scala Redbook : Chapter 2 */

/** Here, formatResult is a higher order function that takes another
 * function called f.
 * Also, Int => Int indicates that f expects an integer argument
 * and will also return an integer.*/

object MyModule {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  /** private def formatAbs(x : Int){
   * val msg = "The absolute value of %d is %d"
   *msg.format(x, abs(x))
   * } */

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, accumulate: Int): Int = {
      if (n <= 0) accumulate
      else go(n - 1, n * accumulate)
    }

    go(n, 1)
  }

  /** private def formatFactorial(n: Int){
   * val msg = "The factorial of %d is %d"
   *msg.format(x, factorial(x))
   * } */

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("factorial", 5, factorial))
  }
}
