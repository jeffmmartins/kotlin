import java.io.File
import java.util.Scanner


fun ler_arquivo(){
    val arquivo = File("C:\\Users\\Jefferson\\Documents\\Conceitos_iniciais\\src\\texto.txt")

    try {
        Scanner(arquivo).use { l ->
            while (l.hasNext()){
                print(l.next())
            }
            l.close()
        }
    }catch (){

    }
}

fun main() {
    ler_arquivo()
}