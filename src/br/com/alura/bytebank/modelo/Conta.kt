package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import java.lang.Exception
import java.lang.RuntimeException

var totalContas: Int = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) : Autenticavel by titular {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    //Delegação
    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valorDeposito: Double) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito
        }
    }

    abstract fun sacarValor(valor: Double)

    fun transfere(valor: Double, contaDestino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Saldo atual: $saldo, valor da transferencia: $valor")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
       // throw RuntimeException()

        saldo -= valor
        contaDestino.deposita(valor)
    }
}