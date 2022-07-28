package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0]=1000.0
    salarios[1]=2000.0
    salarios[2]=3000.0
    salarios.forEach { println(it) }
    salarios.forEachIndexed { index, salario ->
        salarios[index]=salario*1.1
    }
    salarios.forEach { println(it) }
    println("")
    val salarios2= doubleArrayOf(1000.0,2000.2,5000.1)
    salarios2.sort()
    salarios2.forEach { println(it) }
}