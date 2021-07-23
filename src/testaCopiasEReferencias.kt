 fun testaCopiasEReferencias() {

        //Referencias
        val contaMateus = Conta("Mateus", 1005)

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

        val contaThalia = Conta("Thalia", 1003)
        val contaCecilia = Conta("Cecilia", 1004)

        println("titular da conta thalia: ${contaThalia.titular}")
        println("titular da conta cecilia: ${contaCecilia.titular}")

        //Imprimindo o hash
        println(contaThalia)
        println(contaCecilia)
    }

