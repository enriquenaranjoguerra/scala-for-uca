object Main extends App {
  def imprimirNota(nota: (String, Seq[Int])): Unit = {
    val (nombre, ns) = nota
    var mensaje = "Las notas de %s son :".format(nombre)
    ns.foreach(n => mensaje += (" " + n))
    println(mensaje)
  }

  var notas = Map("Pedro" -> Seq(3, 6, 5))
  notas = notas ++ Map("Mayte" -> Seq(8, 6, 7), "Omar" -> Seq(6, 4, 2), ("Jaime", Seq(6, 4, 8)))
  println("Mapa de notas: ")
  notas.foreach(nota => imprimirNota(nota))
  println
}
