abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha : Int
) {
    //Função properties
//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }
    // função properties resumida em uma linha apenas
//    open val bonificacao : Double =  salario * 0.1

    abstract fun bonificacao() : Double

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}







