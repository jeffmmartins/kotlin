fun main() {
    var linhas = 3
    var colunas = 4
    var matriz: Array<Array<Char>> = Array(linhas) { Array(colunas) { ' ' } }
    var c: Char = 'a'
    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            matriz[i][j] = c++
        }
        print("matriz: ")
        for (i in 0 until linhas) {
            for (j in 0 until colunas) {
                print("${matriz[i][j]} ")
            }
            println()
        }
    }
}