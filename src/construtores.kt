class Silvestre(var nome: String){
    var atk : Int? = null
    constructor(nome: String,atk:Int) : this(nome){
        this.atk = atk
    }
    fun AP(){
        println("o animal silvestre é $nome e o atk dele é $atk")
    }
}

fun main() {
    var s1: Silvestre = Silvestre("Cachorro")
    var s2 : Silvestre = Silvestre( "gato", 1000)
    s1.AP()
    s2.AP()
}