class Perro (raza: String) {
  def ladrar(): Unit = println("Guau")
}

class Chihuahua(nombre: String) extends Perro("chihuahua") {
  override def ladrar(): Unit = println(s"Guau pero soy un chihuahua y me llamo $nombre")
}

object Main extends App {
  val perro = new Perro("chihuahua")
  perro.ladrar()
  val chihuahua = new Chihuahua("Canelo")
  chihuahua.ladrar()
}