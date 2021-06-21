object Main extends App {
  def signo(x: Int): Int = {
    if (x >= 0)
      return 1
    else
      return -1
  }

  println("El signo de -3 es %d, mientras que el de 4 es %d".format(signo(-3), signo(4)))
}
