import java.util.Scanner

fun ler_int() {
    val scan = Scanner(System. `in`)
    println("Digite o numero: ")
    var num = scan.nextInt()
    println("o numero é: ${num  + 1}")
}

fun ler_double() {
    val scan = Scanner(System. `in`)
    println("Digite o numero tipo double: ")
    var num = scan.nextDouble()
    println("o numero é: ${num  + 1}")
}

fun ler_float() {
    val scan = Scanner(System. `in`)
    println("Digite o numero tipo float: ")
    var num = scan.nextFloat()
    println("o numero é: ${num  + 1}")
}

fun main() {
 ler_int()
 ler_double()
}