package com.fugisawa.p03NullSafety

var propriedadeNaoNullable: String = "Uma String qualquer."
var propriedadeNullable: String? = "Uma String qualquer, ou null."

fun imprimirTamanho(texto: String?) {
    val tamanho = texto?.length ?: 0
    println("Tamanho: $tamanho")
}

fun main() {
    imprimirTamanho("Olá")
    imprimirTamanho(null)

    val stringNula: String? = null
    // println(stringNula!!.length) // lança NullPointerException!
}
