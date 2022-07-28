package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao",3000.0,"CLT")
    val bernardo = Funcionario("Bernardo",24000.0,"PJ")
    val carol = Funcionario("Carol",15000.0,"CLT")
    val funcionarios = mutableListOf(joao,bernardo)
    funcionarios.forEach { println(it) }
    println("....")
    funcionarios.add(carol)
    funcionarios.forEach { println(it) }
    println("....")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    println("..SET..")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.add(bernardo)
    funcionarioSet.add(carol)
    funcionarioSet.forEach { println(it) }



}