import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner


fun ler_arquivo(){
    val arquivo = File("C:\\Users\\Jefferson\\Documents\\Conceitos_iniciais\\src\\texto.txt")

    try {
        Scanner(arquivo).use { l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        print("Falha ao ler o arquivo")
    }
}

fun main() {
    ler_arquivo()
}