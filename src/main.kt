import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException


fun main() {

    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua vergueiro")
    val novoLogradouro: String? = enderecoNulo?.logradouro

    enderecoNulo?.let {
        println(it.logradouro.length)
        //Elvis Operator
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento tem que ser preenchido")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}
//Safe Casts
//Faz um cast para tipos nullable, ou podem receber nulo
fun teste(valor: Any) {
    val numero: Int? = valor as? Int
}
















