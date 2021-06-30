object Main extends App {
  var notas = Map("Pedro" -> 3)
  notas = notas + (("Carla", 10))
  notas = notas ++ Map("Mayte" -> 8, "Omar" -> 6, ("Jaime", 6))
  println("Mapa de notas completo: " + notas)
  println
  val p = "Pedro"
  println("La nota de %s es %d" format(p, notas(p)))
  println("Las claves son: " + notas.keySet)
  println("Los valores son: " + notas.values)
  println
  notas = notas - "Pedro"
  println("Mapa de notas sin Pedro:")
  notas.foreach(nota => println("La nota de %s es %d".format(nota._1, nota._2)))
}
