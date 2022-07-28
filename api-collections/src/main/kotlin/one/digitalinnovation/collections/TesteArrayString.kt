package one.digitalinnovation.collections

fun main() {
    val nomes= Array(5){""}
    nomes[0]="Bernardo"
    nomes[1]="Bianca"
    nomes[2]="Carolina"
    nomes[3]="Makoy"
    nomes[4]="Pantufa"
    nomes.forEach { println(it) }
    println("   ")
    val nomes2= arrayOf("Be","Bi","Carol")
    nomes2.sort()
    nomes2.forEach { println(it) }
}