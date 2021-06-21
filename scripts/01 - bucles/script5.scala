object Main extends App {
  val result = for (i <- 1 to 5) yield 2*i
  println(result)
}
