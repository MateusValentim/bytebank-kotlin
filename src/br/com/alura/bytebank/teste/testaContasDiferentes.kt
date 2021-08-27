import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val poupanca: ContaPoupanca =
        ContaPoupanca(val corrente : ContaCorrente = ContaCorrente (titular = "Mayara",cpf = "", senha 1) ,numeroConta = 1000)
    val corrente: ContaCorrente = ContaCorrente(Cliente(nome="Mateus", cpf = "", senha = 1), numeroConta = 1001)

    poupanca.deposita(1000.0)
    corrente.deposita(1000.0)

    println("Saldo br.com.alura.bytebank.modelo.Conta Poupança: ${poupanca.saldo}")
    println("Saldo br.com.alura.bytebank.modelo.Conta Corrente: ${corrente.saldo}")

    corrente.sacarValor(100.0)
    poupanca.sacarValor(100.0)

    println("Saldo br.com.alura.bytebank.modelo.Conta Poupança: ${poupanca.saldo}")
    println("Saldo br.com.alura.bytebank.modelo.Conta Corrente: ${corrente.saldo}")

    corrente.transfere(100.0, poupanca)

    println("Saldo br.com.alura.bytebank.modelo.Conta Poupança: ${poupanca.saldo}")
    println("Saldo br.com.alura.bytebank.modelo.Conta Corrente: ${corrente.saldo}")
}
