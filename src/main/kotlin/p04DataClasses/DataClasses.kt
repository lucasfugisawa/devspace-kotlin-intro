package com.fugisawa.p04DataClasses

// Implementações padrões de toString(), equals(), hashCode(), copy()
// e componentN() para desestruturação:
data class Produto(
    val nome: String,
    val preco: Double,
)

fun main() {
    val p1 = Produto("Café", 9.99)
    val p2 = Produto("Chá", 6.49)

    // toString bonitinho
    println(p1) // Produto(nome=Café, preco=9.99)

    // Desestruturação
    val (nome, preco) = p1
    println("Produto: $nome custa R$ $preco")

    // Igualdade estrutural com ==
    val outroCafe = Produto("Café", 9.99)
    println(p1 == outroCafe) // true

    // Cópia fácil com alterações (favorece imutabilidade / programação funcional)
    val p3 = p1.copy(preco = 11.49)
    println(p3) // Produto(nome=Café, preco=11.49)
}
