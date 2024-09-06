import kotlin.math.sqrt

fun main() {

    try {
        var str : String? = null
        str = "Felipe"
        println("Tamanho da string é: ${str!!.length}")

        var a = 10/0
        println("O resultado da variavél é : ${a}")

        var s = -9.0
        var c : Double = sqrt(s)
        if (s<0){
            throw IllegalStateException()
        }
        var t = 1
        if (t == 1){
            throw Exception("o valor de x nao pode ser 1")
        }

    }catch (e: NullPointerException) {
        println("A variavel está vazia")
    }catch (e: ArithmeticException) {
        println("Nao existe divisao por 0")
    }catch (e: IllegalStateException){
        println("Não existe raiz quadrada negativa")
    }catch (e: Exception) {
        print("Caiu na exceção geral")
        println(e.message)
    }finally {
        println("executando o finally, ao finalizar o bloco ")
    }
}