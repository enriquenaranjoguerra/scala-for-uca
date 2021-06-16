object Main extends App {
  println("Bucle for con dos variables")
  for (a <- 1 to 3; b <- 1 until 3) {
    println("Valor de a: %d, valor de b: %d".format(a, b))
  }

  println("\nIterar sobre varios elementos con foeach")
  (1 to 4).foreach {println}

  println("\nSacar la primera letra de cada palabra")
  val compra = List("Fruta", "Verdura", "Carne", "Pescado")
  compra.foreach(p => println(p.head))
}
