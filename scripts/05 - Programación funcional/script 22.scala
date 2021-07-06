object Main extends App {
  def valorEnUnCuarto(f: Double => Double): Double = f(0.25)
  def rectaReg(x: Double): Double = 3 * x - 2
  println(valorEnUnCuarto(rectaReg))
}
