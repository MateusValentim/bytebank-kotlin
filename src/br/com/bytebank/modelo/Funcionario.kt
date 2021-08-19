package br.com.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    //Função properties
//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }
    // função properties resumida em uma linha apenas
//    open val bonificacao : Double =  salario * 0.1

    abstract fun bonificacao() : Double

}







