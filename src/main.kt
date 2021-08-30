import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas


fun main() {
    val mateus : Cliente = Cliente(nome = "Mateus Valentim", "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = mateus, numeroConta = 1)
    val contaCorrente = ContaCorrente(titular = mateus, numeroConta = 1001)
    
    testaContasDiferentes()

    println("Total de contas: ${totalContas}")
}








