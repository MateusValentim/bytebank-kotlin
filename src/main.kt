import br.com.alura.bytebank.modelo.*
import java.lang.ArithmeticException
import java.lang.ClassCastException


fun main() {
    println("Inicio main")
    try {
        10/0
    } catch ( e :ArithmeticException){
        println("ArithmeticException foi capturada, por favor divida por algum número válido")
    }
    funcao1()
    println("Fim main")
}

fun funcao1(){
    println("Inicio função 1")
    try {
        funcao2()
    } catch (e : ClassCastException){
        println("ClassCastException foi capturada")
    }
    println("Fim função 1")
}

fun funcao2(){
println("Inicio função 2")
    for (i in 1..5){
        println(i)
        //Exception de cast
        val endereco = Any()
        endereco as Endereco
    }
    println("Fim função 2")
}











