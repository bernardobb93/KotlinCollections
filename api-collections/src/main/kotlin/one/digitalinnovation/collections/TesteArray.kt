package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0]=0
    values[1]=6
    values[2]=4
    values[3]=5
    values[4]=8

    for(valor in values){
        print(valor)
    }
    println("  ")
    values.forEach {
        print(it)
    }
    println("  ")
    for (index in values.indices){
        print(values[index])
    }
    println("  ")
    values.sort()
    for(valor in values){
        print(valor)
    }
}