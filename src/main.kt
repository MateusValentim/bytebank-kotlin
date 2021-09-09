import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco


fun main() {

var enderecoNulo: Endereco? = Endereco(logradouro = "Rua vergueiro")
val novoLogradouro: String? = enderecoNulo?.logradouro

    enderecoNulo?.let {
        println(it.logradouro.length)
    }
}
















