fun Impressao() { //VOID
    print("função sem parametro e sem retorno ")
}
fun Soma(a:Int, b: Int):Int{
    return  a+b
}

fun main() {
    Impressao()
    var x = 10
    var y = 20
    print(Soma(x,y))
    soma_2(x,y)
}

fun soma_2(a:Int, b:Int) { // função com parametro e sem retorno
    println("a soma é: ${a+b}" )
}