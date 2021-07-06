object Main extends App {
  def compos(f: Double => Double, g: Double => Double): Double => Double = x => f(g(x))
  def func1(x: Double): Double = 3 * x
  def func2(x: Double): Double = x + 1
  println(compos(func1, func2)(2))
}
