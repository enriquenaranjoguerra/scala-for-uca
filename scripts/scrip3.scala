object Main extends App {
  var result = for (i <- 1 to 5) yield 2*i
  println(result)

  result = for {i <- 1 to 5 if i % 2 == 0; println i} yield 2*i
  println(result)
}
