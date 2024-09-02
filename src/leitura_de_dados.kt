fun main() {


    var num = readlnOrNull()?.toInt() ?: 0
    var num1 = readlnOrNull()?.toDouble() ?: 0.0
    var num2 = readlnOrNull()?.toFloat() ?: 0.0f
    var num3 = readlnOrNull().toBoolean() ?: false
    print("\n")
    println("tipo Inteiro: ${num}")
    println("tipo Double: ${num1}")
    println("tipo Float: ${num2}")
    println("tipo Boolean: ${num3}")
}