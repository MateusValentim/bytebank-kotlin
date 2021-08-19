package br.com.bytebank.modelo

import br.com.bytebank.modelo.Conta

class ContaPoupanca(titular: String, numeroConta: Int) : Conta
    (titular,
    numeroConta) {

    override fun sacarValor(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }


}