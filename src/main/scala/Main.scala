object Main extends App {
  var x = 3
  // multiplicamos x por 2
  x *= 2
  var y = 4
  // incrementamos el valor de y en 3
  y += 3
  val suma = x + y
  val mensaje = "La suma de %d más %d es %d".format(x, y, suma)
  println(mensaje)
}