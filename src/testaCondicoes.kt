fun testaCondicoes(saldo: Double) {

//    when {
//        saldo > 0.0 -> {
//            println("saldo em conta é positivo")
//        }
//        saldo == 0.0 -> {
//            println("saldo em conta é neutro")
//        }
//        else -> {
//            println("saldo é negativo")
//        }

    when {
        saldo > 0.0 -> println("saldo em conta é positivo")
        saldo == 0.0 -> println("saldo em conta é neutro")
        else -> println("saldo em conta é negativo")
    }
}
