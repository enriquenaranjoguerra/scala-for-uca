object DiaSemana extends Enumeration {
  type DiaSemana = Value
  val Lun, Mar, Mie, Jue, Vie, Sab, Dom = Value
}

object Main extends App {
  println(DiaSemana.Vie)
  println(DiaSemana.values)
}
