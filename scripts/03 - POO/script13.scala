object Multiplicador{
  var producto = 3
  def apply(x: Int): Int = producto * x
  override def toString: String = s"Multiplicamos por $producto"
}

object Main extends App {
  val num = 4
  println("El producto de %d por %d es %d".format(Multiplicador.producto, num, Multiplicador(4)))
  Multiplicador.producto = 5
  println("El producto de %d por %d es %d".format(Multiplicador.producto, num, Multiplicador(4)))
}
