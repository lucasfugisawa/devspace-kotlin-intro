package com.fugisawa.p01TipagemMutabilidade

fun main() {
    // Kotlin tem tipagem estática forte.

    val nome = "João" // inferência: String
    var idade = 30 // mutável, tipo inferido: Int

    idade += 1
    println("$nome agora tem $idade anos")

    val nomes = listOf("Ana", "Bruno", "Carlos") // tipo List<String> inferido
    val primeiro = nomes.first() // tipo String inferido
}
