import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaAlex = ContaPoupanca("Alex", 1000)
    contaAlex.deposita(500.0)

    val contaZina = ContaCorrente("HelenaZina", 1001)
    contaZina.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)


    println("sacando valor da conta do Alex")
    contaAlex.sacarValor(100.0)
    println(contaAlex.saldo)

    println("transferindo da conta do Alex para conta da Zina")
    if (contaAlex.transfere(100.0, contaZina)) {
        println("Transferencia sucedida")
    } else {
        println("Transferencia não realizada")
    }

    println("Saldo Alex: ${contaAlex.saldo}")
    println("Saldo Zina: ${contaZina.saldo}")
}
