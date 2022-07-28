package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao",3000.0,"CLT")
    val bernardo = Funcionario("Bernardo",24000.0,"PJ")
    val carol = Funcionario("Carol",15000.0,"CLT")
    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome,joao)
    repositorio.create(bernardo.nome,bernardo)
    repositorio.create(carol.nome,carol)
    println(repositorio.findById(joao.nome))
    println("....")
    repositorio.findAll().forEach { println(it) }
    println("....")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}