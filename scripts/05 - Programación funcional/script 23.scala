object Main extends App {
  def componerConMasDos(f: Double => Double): (Double => Double) = {
    x => f(x) + 2
  }
  def rectaReg(x: Double): Double = 3 * x - 2
  println(componerConMasDos(rectaReg)(4))
}
