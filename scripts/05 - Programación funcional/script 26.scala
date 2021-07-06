object Main extends App {

  def esPrimo(n: Int): Boolean = {
    if(n <= 2) return true
    !(2 to n / 2).exists(i => n % i == 0)
  }

  1 to 10 filter esPrimo map(x => x*x) foreach println
}