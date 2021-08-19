import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val poupanca: ContaPoupanca = ContaPoupanca(titular = "Mayara", numeroConta = 1000)
    val corrente: ContaCorrente = ContaCorrente(titular = "Mateus", numeroConta = 1001)

    poupanca.deposita(1000.0)
    corrente.deposita(1000.0)

    println("Saldo br.com.bytebank.modelo.Conta Poupança: ${poupanca.saldo}")
    println("Saldo br.com.bytebank.modelo.Conta Corrente: ${corrente.saldo}")

    corrente.sacarValor(100.0)
    poupanca.sacarValor(100.0)

    println("Saldo br.com.bytebank.modelo.Conta Poupança: ${poupanca.saldo}")
    println("Saldo br.com.bytebank.modelo.Conta Corrente: ${corrente.saldo}")

    corrente.transfere(100.0, poupanca)

    println("Saldo br.com.bytebank.modelo.Conta Poupança: ${poupanca.saldo}")
    println("Saldo br.com.bytebank.modelo.Conta Corrente: ${corrente.saldo}")
}
