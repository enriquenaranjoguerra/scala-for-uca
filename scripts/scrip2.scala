object Main extends App {
  println("Bucle for con to")
  for (i <- 1 to 5) {
    println("Valor de i: %d".format(i))
  }

  println("Bucle for con until")
  for (i <- 1 until 5) {
    println("Valor de i: %d".format(i))
  }
  println("Bucle for con dos variables")
  for (a <- 1 to 3; b <- 1 until 3) {
    println("Valor de a: %d, valor de b: %d".format(a, b))
  }
}
