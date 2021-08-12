fun main() {
    val gerente: FuncionarioAdmin = Gerente(
        nome = "Mateus",
        senha = 1234,
        salario = 2000.0,
        cpf = "123.123.123.21"
    )
    val diretor: FuncionarioAdmin =
        Diretor(
            nome = "Helena",
            senha = 1234,
            salario = 3000.0,
            cpf = "222.222.222.22",
            plr = 1000.0
        )

    val  sistemaInterno = SistemaInterno ()
    sistemaInterno.entra(gerente, senha = 1234)
    sistemaInterno.entra(diretor, senha = 1234)
}









