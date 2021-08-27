package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaPoupanca(titular: Cliente, numeroConta: Int) : Conta
    (titular,
    numeroConta) {

    override fun sacarValor(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }


}