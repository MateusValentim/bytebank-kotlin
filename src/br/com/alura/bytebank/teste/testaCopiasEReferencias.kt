import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

        //Referencias
        val contaMateus = ContaCorrente("Mateus", 1005)

        var contaHelena = contaMateus
        contaHelena.titular = "Helena"

        println("titular conta mateus: ${contaMateus.titular}")
        println("titular conta helena: ${contaHelena.titular}")

        // imprimindo o hash das referencias
        println(contaMateus)
        println(
            contaHelena
        )
        //Copias

        val contaThalia = ContaCorrente("Thalia", 1003)
        val contaCecilia = ContaPoupanca("Cecilia", 1004)

        println("titular da conta thalia: ${contaThalia.titular}")
        println("titular da conta cecilia: ${contaCecilia.titular}")

        //Imprimindo o hash
        println(contaThalia)
        println(contaCecilia)
    }

