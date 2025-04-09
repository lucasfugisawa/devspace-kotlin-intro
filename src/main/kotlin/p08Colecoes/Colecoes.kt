package com.fugisawa.p08Colecoes

data class Usuario(
    val nome: String,
    val idade: Int,
    val ativo: Boolean,
)

val usuarios =
    listOf(
        Usuario("Ana", 28, true),
        Usuario("Bruno", 35, false),
        Usuario("Carlos", 22, true),
        Usuario("Diana", 19, true),
        Usuario("Eduarda", 17, false),
    )

fun main() {
    // FILTRANDO E ORDENANDO:
    // Filtrar apenas ativos maiores de 21 e ordenar por nome
    val ativosMaiores =
        usuarios
            .filter { it.ativo && it.idade > 21 }
            .sortedBy { it.nome }
            .map { it.nome }

    println("Ativos maiores de 21: $ativosMaiores")

    // AGRUPANDO:
    val porAtividade = usuarios.groupBy { it.ativo }

    println("Usuários ativos:")
    porAtividade[true]?.forEach { println("- ${it.nome}") }

    println("Usuários inativos:")
    porAtividade[false]?.forEach { println("- ${it.nome}") }

    // VERIFICANDO CONDIÇÕES:
    val todosAtivos = usuarios.all { it.ativo }
    println("Todos são ativos? $todosAtivos")

    val temInativo = usuarios.any { !it.ativo }
    println("Tem pelo menos um inativo? $temInativo")

    val maioresDeIdade = usuarios.count { it.idade >= 18 }
    println("Maiores de idade: $maioresDeIdade")

    // SELECIONANDO PRIMEIROS / ÚLTIMOS:
    val nomesOrdenados =
        usuarios
            .map { it.nome }
            .sorted()

    val primeiros3 = nomesOrdenados.take(3)
    val ultimos3 = nomesOrdenados.takeLast(3)
    println("Primeiros 3 nomes: $primeiros3")
    println("Últimos 3 nomes: $ultimos3")

    val todosMenosOs3Primeiros = nomesOrdenados.drop(3)
    val todosMenosOs3Ultimos = nomesOrdenados.dropLast(3)

    println("Todos menos os 3 primeiros: $todosMenosOs3Primeiros")
    println("Todos menos os 3 últimos: $todosMenosOs3Ultimos")

    // OUTROS: .associateBy, .distinctBy, etc.
}
