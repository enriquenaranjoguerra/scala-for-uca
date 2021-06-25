object Uvita{
  val raza: String = "carlino"
  val nombre: String = "Uvita"
  var edad: Int = 3
  def cumple(): Unit = edad += 1
  override def toString: String = s"$nombre es un $raza de edad $edad"
}

object Main extends App {
  println(Uvita)
  Uvita.cumple()
  println(Uvita)
}
