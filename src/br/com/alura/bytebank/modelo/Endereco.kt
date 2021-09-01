package br.com.alura.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
) {

    override fun toString(): String = """
        |Endereço (Logradouro: '$logradouro', 
        |'numero=$numero', 
        |'bairro=$bairro', 
        |'cidade=$cidade', 
        |'estado=$estado', 
        |'cep=$cep', 
        |'complemento=$complemento'""".trimMargin()

    override fun equals(other: Any?): Boolean {
        if (other != null && other is Endereco) {
            return this.cep == other.cep
        }
        return false
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }

}

