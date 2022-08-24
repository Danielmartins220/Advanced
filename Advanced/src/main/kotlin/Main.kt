import java.lang.Exception

fun main() {
    try {
        println(" digite seu nome: ")
        val nome = readln()

        println(" digite seu telefone: ")
        val tel = readln()

        println(" digite seu endereço: ")
        val end = readln()

        val cliente = Cliente(nome, end, tel)


        while (true){

            println()
            println("***Menu***")
            println("1 - Adicionar compra")
            println("2 - Remover compra")
            println("3 - Listar compras")
            println("4 - Sair")

            print("Opc: ")
            val opc = readln().toInt()
            println()

            when(opc) {

                1 -> {
                    println(" Digite o produto que voce vai adicionar:")
                    val prod = readln()
                    cliente.addCompra(prod)
                }

                2 -> {
                    println(" Digite o produto que voce vai remover:")
                    val prod = readln()
                    cliente.addCompra(prod)
                }

                2 -> {
                    cliente.exibirCompras()
                }

                4 -> println("Invalida")

            }
        }
    } catch (e: Exception){
        println(e.message)
    }

}

private fun Unit.exibirCompras() {

}

private fun Unit.addCompra(prod: String) {

}

fun Cliente(nome: String, endereco: String, telefone: String) {

}


