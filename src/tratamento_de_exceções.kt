import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 0
    try {
        val res = (numerador/denominador)
        println(" O resultado é: ${res}")
    }catch (e: ArithmeticException){
        println("Não foi possivel resolver")
    }

    println()
    val num = 4.0
    try {
        val raiz = sqrt(num)
        if (num < 0){
            throw IllegalStateException()
        }
        print("O resultado da radiação é ${raiz}")
    } catch (e: IllegalStateException){
        print("não existe raiz real para a radiação")
    }
}