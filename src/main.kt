fun main() {
    println("Bem vindo ao Bytebank:")
    println()

    var mateus = Funcionario(
        cpf = "233.222.765.42",
        nome = "Mateus Valentim",
        salario = 1000.0,
        tipo = 2
    )

    var helena = Gerente(
        cpf = "111.111.111-11",
        nome = "Helena Regina Valentim",
        salario = 5000.0,
        senha = 1111
    )

    println("nome: ${mateus.nome}")
    println("cpf: ${mateus.cpf}")
    println("salario: ${mateus.salario}")
    println("bonificação: ${mateus.bonificacao()}")

    println()

    println("nome: ${helena.nome}")
    println("cpf: ${helena.cpf}")
    println("salario: ${helena.salario}")
    println("bonificação: ${helena.bonificacao()}")

    if (helena.autentica(1111)){
        println("Autenticado com sucesso")
    } else{
        println("Falha na autenticação")
    }
}







