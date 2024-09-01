fun main() {
    var str: String? = null
    if (str == null) {
        print("essa variavel é nula")
    } else {
        print(str)
    }
    //operador elvis - semelhando ao ternario de outras linguagens.
    print(str?: "nula")
}