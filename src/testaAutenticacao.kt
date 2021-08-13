fun testaAutenticacao() {

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

    val cliente = Cliente(
        nome = "Rosana Campos",
        cpf = "333.222.111.55",
        senha = 1234
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, senha = 1234)
    sistemaInterno.entra(diretor, senha = 1234)
    //sistemaInterno.entra(cliente, senha = 1234)
}
