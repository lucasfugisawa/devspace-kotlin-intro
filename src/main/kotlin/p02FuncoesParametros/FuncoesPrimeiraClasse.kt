package com.fugisawa.p02FuncoesParametros

// Kotlin trata funções como valores

val dobrar: (Int) -> Int = { it * 2 }

// Funções podem ser passadas como argumento
fun aplicarOperacao(
    x: Int,
    operacao: ((Int) -> Int)?,
): Int {
    if (operacao == null) return x
    return operacao(x)
}

fun main() {
    println(dobrar(4))

    val triplo = aplicarOperacao(5) { it * 3 }
    println(triplo)
}
