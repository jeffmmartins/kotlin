class Pessoa (val ano_nasc: Int, var nome: String){

}

fun main() {
    var pessoa: Pessoa = Pessoa(ano_nasc = 1988, nome = "Jefferson")
    println(pessoa.nome)
}