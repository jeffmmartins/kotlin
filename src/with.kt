class Obj(var n: Int){
    fun amanhacher(){
        if (n == 0){
            print("Está dormindo")
        }else {
            print("esta acordado")
        }
    }
}

fun main() {
    var obj: Obj = Obj(n = 1)
    with(obj){
        amanhacher()
    }
}