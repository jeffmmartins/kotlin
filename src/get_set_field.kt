class Planeta(var nome: String){
    private var id = 1
    var tamanho = 1000
    var fala = "Terra"
        get() {
            println("acessando o GET")
            return field
        }
        set(value) {
            println("Acessando o SET")
            field = value
        }

}

class Planeta2{
    var nome: String = ""
        get() {
            println("novo valor é ${field}")
            return field
        }
        set(value) {
            if (value == ""){
                println("Toda palavra tem um nome")
            }else{
                field = value
            }
        }
}

fun main() {
    var p: Planeta = Planeta(nome= "terra")
    println("imprimindo o tamanho ${p.tamanho}")
    var a: Planeta = Planeta(nome = "Marte")
    a.fala
    a.fala = "novo planeta Marte"
    a.fala
}