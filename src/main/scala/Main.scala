object Main extends App {
  var x = 3
  var y = 4
  // incrementamos el valor de y en 2
  y += 2
  val suma = x + y
  val mensaje = "La suma de %d más %d es %d".format(x, y, suma)
  println(mensaje)
}