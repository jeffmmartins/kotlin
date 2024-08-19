fun main() {
    var i = 0
    do{
    println("${i} ")
    i++
    }while (i != 10)

    while(i == 10){
        println("loop done")
        i++
    }
    print("\n")

    do {
        print(("Qual seu nome: "))
        val value = readLine()
    }while (value == "")
}