fun main() {

    try {
        var str : String? = null
        //str = "Felipe"
        println("Tamanho da string é: ${str!!.length}")
    }catch (e: NullPointerException) {
        println("A variavel está vazia")
    }
}