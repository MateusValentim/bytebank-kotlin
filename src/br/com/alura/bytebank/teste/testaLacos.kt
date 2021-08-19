fun testaLacos() {
    var i = 0
    while (i < 5) {

        val titular = "Mateus Valentim $i"
        val numeroConta: Int = 2000 + i
        var saldo: Double = i + 05.0

        println("titular: $titular");
        println("numero da conta: $numeroConta")
        println("saldo: $saldo")
        println()
        i++
    }

    //Decrescente
    for (i in 5 downTo 1) {
        if (i == 4) {
            continue
        }
        val titular = "Mateus Valentim $i"
        val numeroConta: Int = 2000 + i
        var saldo: Double = i + 05.0

        println("titular: $titular");
        println("numero da conta: $numeroConta")
        println("saldo: $saldo")
        println()
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}
