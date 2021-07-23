fun main() {
    println("Bem vindo ao Bytebank:")

    var mateus = Funcionario(
        cpf = "233.222.765.42",
        nome = "Mateus Valentim",
        salario = 1000.0
    )

    println("nome: ${mateus.nome}")
    println("cpf: ${mateus.cpf}")
    println("salario: ${mateus.salario}")
    print("bonificação: ${mateus.bonificacao()}")
}







