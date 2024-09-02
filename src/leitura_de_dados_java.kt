import java.util.Scanner

fun ler_int() {
    val scan = Scanner(System. `in`)
    println("Digite o numero: ")
    var num = scan.nextInt()
    println("o numero é: ${num  + 1}")
}

fun main() {
 ler_int()
}