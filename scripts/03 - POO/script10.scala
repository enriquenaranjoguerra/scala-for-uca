class Perro(var raza: String, var edad: Int){
  def this() = this("carlino", 2)
  def this(raza: String) = this(raza, 2)
  def this(edad: Int) = this("carlino", edad)
  override def toString: String = s"Un $raza de edad $edad"
}

object Main extends App {
  println(new Perro("chihuahua", 5))
  println(new Perro("corgi"))
  println(new Perro(8))
  println(new Perro())
}
