import scala.collection.mutable.ArrayBuffer

trait Animal{
  def comer: Unit = println("Mira cómo como")
}

class Perro(val nombre: String) extends Animal{
  override def comer: Unit = {
    super.comer
    println(" comida de perretes")
  }
}
class Pez(val aguasalada: Boolean) extends Animal{
  override def comer: Unit = {
    super.comer
    println(" comida de pescaditos")
  }
}

object Main extends App {
  val Geranio = new Perro("Geranio")
  val Nemo = new Pez(true)
  val animales = ArrayBuffer.empty[Animal]
  animales.append(Geranio)
  animales.append(Nemo)
  animales.foreach(_.comer)
}
