package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao",3000.0)
    val bernardo = Funcionario("Bernardo",4000.0)
    val carol = Funcionario("Carol",15000.0)
    val funcionarios = listOf(joao,bernardo,carol)
    funcionarios.forEach{println(it)}
    println(".....")
    println(funcionarios.find { it.nome =="Carol" })
}

data class Funcionario(
    val nome:String,
    val salario:Double
)