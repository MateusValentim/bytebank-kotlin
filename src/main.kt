import br.com.alura.bytebank.modelo.*


fun main() {

    val endereco = Endereco()

    val objeto : Any = Any()

    imprime(objeto)
    imprime(valor = 1)
    imprime(valor = 1.0)

    val teste: Any = imprime(endereco)
    println(teste)

    testaFuncionarios()
}
    fun imprime(valor: Any) : Any {
        println(valor)
        return valor
    }










