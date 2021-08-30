package br.com.alura.bytebank.modelo

var totalContas : Int = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) {
    var saldo = 0.0
        protected set

    init {
        println("Criando conta")
        totalContas++
    }

    fun deposita(valorDeposito: Double) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito
        }
    }

    abstract fun sacarValor(valor: Double)

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

}