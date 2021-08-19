package br.com.alura.bytebank.modelo

abstract class Conta(var titular: String, val numeroConta: Int) {
    var saldo = 0.0
        protected set

    init {
        //executa durante a construção
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