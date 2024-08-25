fun main() {
    print("Digite a primeira nota: ")
    var nota1: Int = readln().toInt()
    if(nota1 <0 || nota1 > 10){
        print("nota inexstente")
        return
    }
    println()
    print("Digite a nota: ")
    var nota2: Int = readln().toInt()
    if(nota1 <0 || nota1 > 10){
        print("nota inexstente")
        return
    }
    println()
    print("Digite a nota: ")
    var nota3: Int = readln().toInt()
    if(nota1 <0 || nota1 > 10){
        print("nota inexstente")
        return
    }
    println()
    print("Digite a nota: ")
    var nota4: Int = readln().toInt()
    if(nota1 <0 || nota1 > 10){
        print("nota inexstente")
        return
    }
    println()
    var media: Int = (nota1 + nota2 + nota3 + nota4) / 4
    if (media >= 7){
        print("Aprovado")
    }else if(media >= 4 && media < 7){
        print("Recuperação")
    }else{
        print("Reprovado")
    }
}