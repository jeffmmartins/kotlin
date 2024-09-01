fun main() {
    // ? é indicando a exceção
    var str: String? = null
    println(str?.length) // kotlin identifica e assum eo tratamento do erro
    println(str!!.length) // EU assumo o erro
}