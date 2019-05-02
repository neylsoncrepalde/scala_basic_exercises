object LoopsTraining {
  def main(args: Array[String]) {
    var i = 1

    println("While loop...")
    while (i < 11) {
      println(i)
      i += 1
    }

    println("\nFor loop...")
    var j = 1
    for (j <- 1 to 10) {
      println(j)
    }
  }
}
