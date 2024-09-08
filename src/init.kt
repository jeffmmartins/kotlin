class Animal(especie: String) {
    var fala: String = ""
    init {
        fala = if (especie.lowercase() == "cachorro"){
            "auaua"
        }else if (especie.lowercase() == "gato") {
            "miau"
        }else {
            ""
        }
    }
    init {
        println(fala)
    }

    fun falar() {
        println(fala)
    }
}


fun main() {
    val animal : Animal = Animal("gato")
    Animal("cachorro").falar()
    Animal("gato").fala
}