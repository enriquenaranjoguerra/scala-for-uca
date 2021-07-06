object Main extends App {

  Seq("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo") filter (_.length > 6) map (_.length) foreach println


}