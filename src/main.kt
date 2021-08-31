import br.com.alura.bytebank.modelo.*


fun main() {
//object expression
    //Cria um objeto diretamente no arquivo sem a necessidade de criar uma classe

    val thalia = object : Autenticavel{
        val nome : String = "Thalia"
        val cpf: String = "111.111.111.11"
        val senha: Int = 1234

        override fun autentica(senha: Int) = this.senha == senha

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(thalia, 1234)
    println("nome do cliente: ${thalia.nome}, ${thalia.cpf}")

    val mateus : Cliente = Cliente(nome = "Mateus Valentim", "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = mateus, numeroConta = 1)
    val contaCorrente = ContaCorrente(titular = mateus, numeroConta = 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}








