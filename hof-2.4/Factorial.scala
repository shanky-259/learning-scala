/** Given a number, find factorial of that number */
/** Understanding the basics of higher order functions and tail recursion */

object Factorial {

  def factorialOf(n : Int): Int = {
    @annotation.tailrec
    def go(n : Int, accumulate : Int): Int = {
      if(n <= 0) accumulate
      else go(n-1, n*accumulate)
    }
    go(n, 1)
  }

  def main(args: Array[String]): Unit = {
    println(factorialOf(5))
  }
}
