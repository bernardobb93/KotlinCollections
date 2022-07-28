package one.digitalinnovation.collections

fun main() {
    val pair : Pair<String,Double> = Pair("Joao",2000.0)
    val map1= mapOf(pair)
    map1.forEach { (t, u) -> println("Chave: $t - Valor: $u") }
    println("....")
    val map2 = mapOf(
        "Joao" to 2500.0,
        "Carol" to 3500.0

    )
    map2.forEach { (t, u) -> println("Chave: $t - Valor: $u") }


}