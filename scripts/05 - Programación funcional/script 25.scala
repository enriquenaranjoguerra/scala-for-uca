object Main extends App {
  def compos(f: String => Int, g: (String, String) => String): (String, String) => Int = (x, y) => f(g(x, y))
  def concatenar(a: String, b: String): String = a + b
  def longitud(x: String): Int = x.length
  println(compos(longitud, concatenar)("Hola", "Mundo"))
}