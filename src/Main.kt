import kotlin.math.roundToInt

fun main() {

    print("Digite o nome do livro: ")
    val nomeLivro = readLine() ?: ""

    print("Digite o número total de páginas: ")
    val totalPaginas = readLine()?.toIntOrNull() ?: 0

    print("Digite o número de páginas lidas: ")
    val paginasLidas = readLine()?.toIntOrNull() ?: 0

    if (totalPaginas > 0) {
        val porcentagemLida = ((paginasLidas.toDouble() / totalPaginas.toDouble()) * 100).roundToInt()

        // Retorna o nome do livro e a porcentagem lida
        val resultado = "Livro que você está lendo: \"$nomeLivro\" - Progresso de sua leitura: $porcentagemLida%"
        println(resultado)
    } else {
        println("Número total de páginas inválido.")
    }
}
