object Main extends App {

  def suma(a: Int, b: Int): Int = {
    val sum = a + b
    sum
  }

  println("La suma de 2 y 3 vale: %d".format(suma(2, 3)))
}
