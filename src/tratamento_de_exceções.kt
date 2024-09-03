fun main() {
    val numerador = 10
    val denominador = 0
    try {
        val res = (numerador/denominador)
        println(" O resultado é: ${res}")
    }catch (e: ArithmeticException){
        println("Não foi possivel resolver")
    }
}