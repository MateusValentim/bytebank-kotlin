package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("Inicio função 1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println("SaldoInsuficienteException foi capturada")
    }
    println("Fim função 1")
}

fun funcao2() {
    println("Inicio função 2")
    for (i in 1..5) {
        println(i)
        //Exception de cast
        throw SaldoInsuficienteException()
    }
    println("Fim função 2")
}