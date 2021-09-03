import br.com.alura.bytebank.modelo.*
import java.lang.ArithmeticException
import java.lang.ClassCastException
import java.lang.NumberFormatException


fun main() {
    println("Inicio main")
   val entrada: String = "1.0"

   val valorRecebido: Double? = try {
        entrada.toDouble()
   }catch (e: NumberFormatException){
       println("Falha da conversão")
       e.printStackTrace()
       null
   }

    //If expression
    val valorComTaxa : Double? = if (valorRecebido != null){
        valorRecebido + 0.1
    } else {
        0.0
    }

    if (valorComTaxa != null){
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
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











