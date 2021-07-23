class Conta(var titular: String, val numeroConta: Int) {
    var saldo = 0.0
        private set

    init {
        //executa algo durante a construção
    }

    fun deposita(valorDeposito: Double) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito
        }
    }

    fun sacarValor(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }
    
}