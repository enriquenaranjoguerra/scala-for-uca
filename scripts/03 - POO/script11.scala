class Perro(var raza: String, var edad: Int){
  override def toString: String = s"Un $raza de edad $edad"
}

object Main extends App {
  val perrete = new Perro("carlino", 4)
  println("La edad de mi perro es %d".format(perrete.edad))
  perrete.raza = "chihuahua"
  println(perrete)
}
