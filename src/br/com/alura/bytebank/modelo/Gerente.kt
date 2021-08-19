package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override fun bonificacao(): Double {
        println("bonificação gerente")
        return  salario * 2.0
    }
}