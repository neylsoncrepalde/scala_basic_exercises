import scala.io.StdIn._

object Factorial {
  def main(args: Array[String]) {
    println("Please, insert an integer number...")
    val top : Int = readInt()

    for (i <- 1 to top)
    println("Factorial of " + i + ": = " + factorial(i))
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n-1)
  }
}
