package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(5000.0,1500.0,3000.0)

    for (salario in salarios){
        println(salario)
    }
    println("....")
    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")
    println("....")
    val salariosMaior2500=salarios.filter{it>2500}
    salariosMaior2500.forEach { println(it) }

}