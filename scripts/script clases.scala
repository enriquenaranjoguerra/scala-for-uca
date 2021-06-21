class Sumador(var x: Int, var y: Int) {
  def cambiarValores(nx: Int, ny: Int): Unit = {
    x = nx
    y = ny
  }

  def suma(): Int = {
    x + y
  }
}

object Main extends App {
  def suma(a: Int, b: Int): Int = {
    val sum = a + b
    sum
  }

  var s = new Sumador(2, 3)
  s.cambiarValores(4, 5)
  println(s.suma)

  println(suma(2, 3))
}
