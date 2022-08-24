import java.lang.Exception

class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String,
    var multablelistOf: String
) {
    private val listaCompras = multablelistOf

    init {
        checarDados()
    }

    fun addCompra(compra: String) {
        if (compra.isNotBlank()) {
            listaCompras.add(compra)
            println("Produto adicionado com sucesso")
        } else {
            println("Produto Invalido")
        }

    }

    fun removeCompra(compra: String){
        if(listaCompras.contains(compra)){
            listaCompras.remove(compra)
            println("Produto removido com sucesso!")
        }else{
            println("O produto $compra não existe na lista!")
        }
    }

    fun exibirCompras(){
        println(" Lista de compras \n")
        listaCompras.forEach{
            println(it)
        }
    }
    private fun checarDados(){
        if (nome.isBlank()){
            throw Exception(" cadastro feito de maneira errada")
        }
    }


}

private fun String.remove(compra: String) {

}

private fun String.add(compra: String) {

}
