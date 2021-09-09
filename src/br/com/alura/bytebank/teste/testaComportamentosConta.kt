import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import java.lang.Exception
import java.lang.NumberFormatException

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)

    val contaAlex = ContaPoupanca(alex, numeroConta = 1000)
    contaAlex.deposita(700.0)

    val contaZina = ContaCorrente(Cliente(nome = "Zina", cpf = "", senha = 2), numeroConta = 1001)
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
    try {
        contaAlex.transfere(valor = 200.0, contaDestino = contaZina, senha = 1)
        println("Transferencia sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Transferencia não realizada")
        println("Saldo Insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        System.out.println("Falha na transferencia")
        System.out.println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("Saldo Alex: ${contaAlex.saldo}")
    println("Saldo Zina: ${contaZina.saldo}")
}

