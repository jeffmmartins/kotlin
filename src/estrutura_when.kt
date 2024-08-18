fun main() {
    var cargo: String = "Gerente"
    when(cargo){
        "Presidente" -> println(6000f)
        "Gerente" -> println(5000f)
        "Coordenador" -> println(4000f)
        "Analista" -> println(3000f)
        "Estagiario" -> println(1200f)
        else -> println("cargo nao identificado")
    }

    var imc:Float= 67.8f
        when(imc){
            10f -> println("imc está 10 ou abaixo")
            20f -> println("imc esta 20 ou abaixo")
            else -> println("imc nao identificado")
    }
}