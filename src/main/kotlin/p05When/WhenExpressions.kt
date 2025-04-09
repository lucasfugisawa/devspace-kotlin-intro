package com.fugisawa.p05When

// Quando usado como expressão, when é exaustivo.
fun classificarNota(nota: Int): String =
    when (nota) {
        in 9..10 -> "Excelente"
        in 7..8 -> "Bom"
        in 5..6 -> "Regular"
        else -> "Insuficiente"
    }

fun main() {
    println(classificarNota(9))
}
