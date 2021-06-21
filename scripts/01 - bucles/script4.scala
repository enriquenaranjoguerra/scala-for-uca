object Main extends App {
  println("\nIterar sobre varios elementos con foeach")
  (1 to 4).foreach {println}

  println("\nSacar la primera letra de cada palabra")
  val compra = List("Fruta", "Verdura", "Carne", "Pescado")
  compra.foreach(p => println(p.head))
}
