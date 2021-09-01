import br.com.alura.bytebank.modelo.*


fun main() {
    val endereco = Endereco(logradouro = "Rua Vitória", cep = "10100011")
    val enderecoNovo = Endereco(logradouro = "Rua Vitória",cep = "10100011")

    println(endereco)
    println(enderecoNovo)

    println(endereco.equals(enderecoNovo))
    println(enderecoNovo.hashCode())
    println(endereco.hashCode())

}
    fun imprime(valor: Any) : Any {
        println(valor)
        return valor
    }










