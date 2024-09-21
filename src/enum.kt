enum class Prioridade( val v:Int){
    B(v=1), M(v=2), A(v=3)
}

fun main() {
    for (p in Prioridade.entries){
        print(p.v)
    }
}