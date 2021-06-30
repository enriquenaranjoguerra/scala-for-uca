object Main extends App {
  var secuencia = Seq("Juan", "Ana")
  // Agregamos algunos elementos más
  secuencia = secuencia :+ "Perico"
  secuencia = secuencia :++ Seq("Carla", "Martina","Carla", "Martina")
  println(secuencia)
  println

  // Métodos de acceso a elementos
  println("El elemento en el índice 2 es %s" format secuencia(2))
  println("La primera instancia de Martina está en el índice %d" format(secuencia indexOf "Martina"))
  println("La última instancia de Carla está en el índice %d" format(secuencia lastIndexOf "Carla"))
  println(secuencia.drop(secuencia indexOf( "Carla")))
  println

  // Cabecera, cola y último elemento
  println("El primer elemento es %s" format secuencia.head)
  println("El último elemento es %s" format secuencia.last)
  println("La cola de la secuencia es " + secuencia.tail)
  println

  //Ordenar la secuencia
  println(secuencia.sorted)
  println

  // Operaciones de conjunto
  var secuencia2 = Seq("A", "B", "Carla")
  println("Operación intersección: " + (secuencia intersect secuencia2))
  println("Operación diferencia: " + (secuencia diff secuencia2))
  println("Eliminar duplicados: " + secuencia.distinct)
}
