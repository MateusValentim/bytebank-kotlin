fun testaContasDiferentes() {
    val poupanca: ContaPoupanca = ContaPoupanca(titular = "Mayara", numeroConta = 1000)
    val corrente: ContaCorrente = ContaCorrente(titular = "Mateus", numeroConta = 1001)

    poupanca.deposita(1000.0)
    corrente.deposita(1000.0)

    println("Saldo Conta Poupança: ${poupanca.saldo}")
    println("Saldo Conta Corrente: ${corrente.saldo}")

    corrente.sacarValor(100.0)
    poupanca.sacarValor(100.0)

    println("Saldo Conta Poupança: ${poupanca.saldo}")
    println("Saldo Conta Corrente: ${corrente.saldo}")

    corrente.transfere(100.0, poupanca)

    println("Saldo Conta Poupança: ${poupanca.saldo}")
    println("Saldo Conta Corrente: ${corrente.saldo}")
}
