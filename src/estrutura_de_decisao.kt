fun main() {
    //Classifique as pessoas atraves da faixa etária
    // idoso: 60 anos acima | adulto: 21 a 59 anos | jovem: 13 a 20 | criança: 12 a abaixo
    var idade: Int = 22
    if (idade >= 60){
        println("Pessoa idosa")
    }else if (idade <= 59 && idade >= 21) {
        println("Pesoa adulta ")
    }else if (idade <= 20 && idade >= 13){
        println("Pessoa jovem")
    }else {
        println("Pesoa crianca")
    }
}