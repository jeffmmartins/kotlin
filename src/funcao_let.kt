fun main() {
    var str: String? = null
    str = "felipe"
    if (str !== null) {
        print("caiu na função if")
    }

    str.let {
        print("CAiu na função let")
    }
}