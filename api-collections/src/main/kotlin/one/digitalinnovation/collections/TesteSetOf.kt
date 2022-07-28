package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao",3000.0,"CLT")
    val bernardo = Funcionario("Bernardo",24000.0,"PJ")
    val carol = Funcionario("Carol",15000.0,"CLT")
    val funcionarios1= setOf(joao,carol)
    val funcionarios2= setOf(bernardo)
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }
    println(".....")
    val funcioanrios3= setOf(bernardo,carol,joao)
    val resultSubs = funcioanrios3.subtract(funcionarios2)
    resultSubs.forEach { println(it) }
    println(".....")
    val resultIntersect = funcioanrios3.intersect(funcionarios1)
    resultIntersect.forEach { println(it) }
}