object Main extends App {
  println("Bucle for con dos variables")
  for (a <- 1 to 3; b <- 1 until 3) {
    println("Valor de a: %d, valor de b: %d".format(a, b))
  }
}
