//fun main() {
//    val livros = mutableListOf<Livro>()
//    adicionarLivro(livros)
//
//
////    println("\nLivros cadastrados:")
////    for (livro in livros) {
////        livro.exibirInfo()
////        println()
////    }
//}
//
//fun adicionarLivro(livros: MutableList<Livro>) {
//
//    print("Digite o nome do livro: ")
//    val nomeLivro = readLine() ?: ""
//
//    print("Digite o gênero do livro: ")
//    val generoLivro = readLine() ?: ""
//
//    print("Digite o autor do livro: ")
//    val autorLivro = readLine() ?: ""
//
//    print("Digite o número total de paginas do livro: ")
//    val totalPaginas = readLine()?.toIntOrNull() ?: 0
//
//    print("Digite o número de paginas lidas do livro: ")
//    var paginasLidas = readLine()?.toIntOrNull() ?: 0
//
//    val livro = Livro(nomeLivro, generoLivro, autorLivro,totalPaginas, paginasLidas)
//    livros.add(livro)
//
//
//    print("Deseja adicionar outro livro? (s/n): ")
//    val continuar = readLine()?.lowercase() ?: "n"
//
//    if (continuar == "s") {
//        adicionarLivro(livros)
//    }
//
//fun consultaLivros(){}
//    println("\nConsultar livros:")
//    print("Digite o critério de consulta (nome/gênero,autor): ")
//    val criterio = readLine()?.lowercase() ?: ""
//    println
//
//    when (criterio) {
//        "nome" -> {
//            print("Digite o nome do livro a ser pesquisado: ")
//            val pesquisaNome = readLine() ?: ""
//            val resultadosNome = Livro.buscarPorNomeLivro(livros, pesquisaNome)
//            if (resultadosNome.isEmpty()) {
//                println("Nenhum livro encontrado com o título \"$pesquisaNome\".")
//            } else {
//                println("Livros encontrados com o título \"$pesquisaNome\":")
//                resultadosNome.forEach { it.exibirInfo() }
//            }
//        }
//        "genero" -> {
//            print("Digite o genero do livro a ser pesquisado: ")
//            val pesquisaGenero = readLine() ?: ""
//            val resultadosGenero = Livro.buscarPorGenero(livros, pesquisaGenero)
//            if (resultadosGenero.isEmpty()) {
//                println("Nenhum livro encontrado com o autor \"$pesquisaGenero\".")
//            } else {
//                println("Livros encontrados com o autor \"$pesquisaGenero\":")
//                resultadosGenero.forEach { it.exibirInfo() }
//            }
//        }
//        "autor" -> {
//            print("Digite o autor do livro a ser pesquisado: ")
//            val pesquisaAutor = readLine() ?: ""
//            val resultadosAutor = Livro.buscarPorAutor(livros, pesquisaAutor)
//            if (resultadosAutor.isEmpty()) {
//                println("Nenhum livro encontrado com o título \"$pesquisaAutor\".")
//            } else {
//                println("Livros encontrados com o título \"$pesquisaAutor\":")
//                resultadosAutor.forEach { it.exibirInfo() }
//            }
//        }
//        else -> println("Critério de consulta inválido.")
//    }
//}
//
//class Livro(
//    val nomeLivro: String,
//    val generoLivro: String,
//    val autorLivro: String,
//    val totalPaginas: Int,
//    var paginasLidas: Int
//){
//    fun porcentagemLeitura(): Int{
//        return ((paginasLidas.toDouble() / totalPaginas) * 100).toInt()
//
//    }
//
//    fun exibirInfo(){
//        var porcentagem = porcentagemLeitura()
//        println("Título: $nomeLivro")
//        println("Gênero: $generoLivro")
//        println("Autor: $autorLivro")
//        println("Número total de páginas: $totalPaginas")
//        println("Número de páginas lidas: $paginasLidas")
//        println("Progresso de sua leitura: $porcentagem%")
//    }
//    companion object {
//        fun buscarPorNomeLivro(livros: List<Livro>, nomeLivro: String): List<Livro> {
//            return livros.filter { it.nomeLivro.contains(nomeLivro, ignoreCase = true) }
//        }
//
//        fun buscarPorGenero(livros: List<Livro>, generoLivro: String): List<Livro> {
//            return livros.filter { it.generoLivro.contains(generoLivro, ignoreCase = true) }
//        }
//
//        fun buscarPorAutor(livros: List<Livro>, autorLivro: String): List<Livro> {
//            return livros.filter { it.autorLivro.contains(autorLivro, ignoreCase = true) }
//        }
//    }
//
//}