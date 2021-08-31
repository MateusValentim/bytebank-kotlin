import br.com.alura.bytebank.modelo.*


fun main() {
    val endereco = Endereco(logradouro = "Rua Vitória", cep = "10100011")
    val enderecoNovo = Endereco(logradouro = "Rua Salvador", numero = 40)

    println(endereco)
    println(enderecoNovo)
}
    fun imprime(valor: Any) : Any {
        println(valor)
        return valor
    }










