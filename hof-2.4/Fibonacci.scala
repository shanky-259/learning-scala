/** Find nth Fibonacci number */

object Fibonacci {
  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(a: Int, b: Int, c: Int, n: Int): Int = {
      if(n < 0) c
      else go(b, c, a+b, n-1)
    }
    go(0, 1, 0, n)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(5))
  }
}
