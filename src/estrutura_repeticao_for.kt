fun main() {
    for(i in 1 .. 10) { //estrutura de repetição for.
        println(i)
    }
    print("\n") // quebra de linha

    for(i in 20 downTo 1) { // estrutura descrescente
        print("${i} ")
    }

    val str = "criação de aplicativos"
    for (i in str) {
        print("${i} ")
    }

    print("\n")
    for(i in 1 .. 10 step 2) { //estrutura de repetição for de 2 em 2
        println(i)
    }
}
