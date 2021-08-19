package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
    ) {

     fun autentica(senha: Int): Boolean {
        println("autentica br.com.alura.bytebank.modelo.FuncionarioAdmin")
        if (this.senha == senha) {
            return true
        }
        return false
    }
}







