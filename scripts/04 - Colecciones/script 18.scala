object Main extends App {
  var secuencia = Set("Juan", "Ana")
  // Agregamos algunos elementos más
  secuencia = secuencia + "Perico"
  secuencia = secuencia ++ Seq("Carla", "Martina","Carla", "Martina")
  println(secuencia)
  println

  //Método apply para saber si está presente un elemento
  println("Está presente Perico: " + secuencia("Perico"))
  println("Está presente Geranio: " + secuencia("Geranio"))
  println

  // Operaciones de conjunto
  var secuencia2 = Set("A", "B", "Carla")
  println("Operación intersección: " + (secuencia intersect secuencia2))
  println("Operación diferencia: " + (secuencia diff secuencia2))
  println("Operación unión: " + (secuencia union secuencia2))
}
