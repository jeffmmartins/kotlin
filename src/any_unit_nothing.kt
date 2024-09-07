fun main() {
    a(valor = 10)
    b()
}

fun a(valor: Any){
    print("O valor da variavel tipo any é: ${valor}")
}

fun b(): Unit{
    print("retorno de uma função void")
}