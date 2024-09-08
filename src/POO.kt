class Pessoa (val ano_nasc: Int, var nome: String){
    var idade = 2023 - ano_nasc
    fun saudacao(){
        println("Seja bem vindo ${this.nome}")
    }
    fun acordar (x: Boolean = false){
        if (x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O ${this.nome} está dormindo")
        }
    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(ano_nasc = 1988, nome = "Jefferson")
    println(pessoa.nome)
    println(pessoa.ano_nasc)
    println(pessoa.idade)
    pessoa.saudacao()
    pessoa.acordar()
}