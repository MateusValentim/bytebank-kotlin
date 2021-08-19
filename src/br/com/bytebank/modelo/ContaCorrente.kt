package br.com.bytebank.modelo

import br.com.bytebank.modelo.Conta

class ContaCorrente(titular: String, numeroConta: Int) : Conta
    (titular,
    numeroConta ) {

    override fun sacarValor(valor: Double) {
       val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }


}