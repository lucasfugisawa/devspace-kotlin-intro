package com.fugisawa.p02FuncoesParametros

// Parâmetros nomeados e argumentos/valores padrões
fun saudacao(
    nome: String = "visitante",
    pontuacao: String = "!",
) {
    println("Olá, $nome$pontuacao")
}

fun main() {
    saudacao()
    saudacao("João")
    saudacao("Maria", ".")
    saudacao(nome = "Maria", pontuacao = ".")
    saudacao(pontuacao = ".")

    val frase = "the quick brown fox jumped over the lazy dog"
    val fraseInvertidaEmMaiusculas = inverterEmMauisculas(frase)
    println(fraseInvertidaEmMaiusculas)
}

// Função-expressão
fun inverterEmMauisculas(nome: String): String = nome.uppercase().reversed()
