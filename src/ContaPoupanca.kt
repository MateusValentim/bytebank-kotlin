class ContaPoupanca(titular: String, numeroConta: Int) : Conta
    (titular,
    numeroConta) {

    override fun sacarValor(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }


}