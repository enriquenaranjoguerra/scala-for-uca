object Main extends App {
  val result = for (i <- 1 to 5 if i % 2 == 0) yield {
    println(i)
    3 * i
  }
  println(result)
}
