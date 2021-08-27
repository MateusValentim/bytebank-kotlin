import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

        //Referencias

        val mateus = Cliente(nome = "Mateus", cpf = "", senha = 1)
        val contaMateus = ContaCorrente(mateus, 1005)

        var contaHelena = contaMateus
        contaHelena.titular.nome = "Helena"

        println("titular conta mateus: ${contaMateus.titular}")
        println("titular conta helena: ${contaHelena.titular}")

        // imprimindo o hash das referencias
        println(contaMateus)
        println(
            contaHelena
        )
        //Copias

        val thalia = Cliente(nome = "Thalia", cpf = "", senha = 1)

        val contaThalia = ContaCorrente(thalia, 1003)
        val contaCecilia = ContaPoupanca(
                Cliente(nome = "Cecilia", cpf = "", senha = 2),
                1004
        )

        println("titular da conta thalia: ${contaThalia.titular}")
        println("titular da conta cecilia: ${contaCecilia.titular}")

        //Imprimindo o hash
        println(contaThalia)
        println(contaCecilia)
    }

