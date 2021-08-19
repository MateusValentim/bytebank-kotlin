package br.com.alura.bytebank.modelo

class Auxiliar (
    nome: String,
    cpf: String,
    salario: Double

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double{
        println("bonificação br.com.alura.bytebank.modelo.Auxiliar")
        return salario * 0.05
    }

}