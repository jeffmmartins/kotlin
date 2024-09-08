class Pessoa_ (val ano_nasc: Int, var nome: String){
    var idade = 2023 - ano_nasc
    fun saudacao(){
        println("Seja bem vindo ${this.nome}")
    }
    fun acordar (x: Boolean){
        if (x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O ${this.nome} está dormindo")
        }
    }
}

fun main() {
    println("Qual ano do seu nascimento: ")
    var x = readlnOrNull()?.toInt() ?: 0
    println("qual seu nome: ")
    var y = readln()
    println("Voce esta acordado?")
    var z = readln()
    var pessoa: Pessoa_ = Pessoa_(x,y)
    println(pessoa.nome)
    println(pessoa.ano_nasc)
    println(pessoa.idade)
    pessoa.saudacao()
    if (z == "sim"){
        pessoa.acordar(x = true)
    }else if (z == "não"){
        pessoa.acordar(x = false)
    }


}