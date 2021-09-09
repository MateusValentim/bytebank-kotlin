import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaPoupanca: ContaPoupanca = ContaPoupanca(titular = Cliente(nome = "Mayara", cpf = "123432111", senha = 3, endereco = Endereco(logradouro = "Rua Vergueiro", numero = 777)),
        numeroConta = 1000)
    val corrente: ContaCorrente = ContaCorrente(Cliente(nome="Mateus", cpf = "", senha = 1), numeroConta = 1001)

    contaPoupanca.deposita(1000.0)
    corrente.deposita(1000.0)

    println("Saldo br.com.alura.bytebank.modelo.Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo br.com.alura.bytebank.modelo.Conta Corrente: ${corrente.saldo}")

    corrente.sacarValor(100.0)
    contaPoupanca.sacarValor(100.0)

    println("Saldo: ${contaPoupanca.saldo}")
    println("Endereco: ${contaPoupanca.titular.endereco.logradouro}")
    println("Numero: ${contaPoupanca.titular.endereco.numero}")
    println("Saldo br.com.alura.bytebank.modelo.Conta Corrente: ${corrente.saldo}")

    corrente.transfere(100.0, contaPoupanca, 3)

    println("Saldo br.com.alura.bytebank.modelo.Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo br.com.alura.bytebank.modelo.Conta Corrente: ${corrente.saldo}")
}
