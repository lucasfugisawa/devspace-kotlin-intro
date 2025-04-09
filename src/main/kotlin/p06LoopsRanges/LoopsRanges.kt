package com.fugisawa.p06LoopsRanges

fun main() {
    // De 1 a 5
    for (i in 1..5) {
        println("i = $i")
    }

    // De 0 a 10 pulando de 2 em 2
    for (i in 0..10 step 2) {
        print("$i ")
    }

    // De trás pra frente
    for (i in 10 downTo 1) {
        print("$i ")
    }

    val range = 10 downTo 1 step 2
    for (i in range) {
        print("$i ")
    }

    // Checando se algo está num range
    val idade = 20
    if (idade in 18..60) {
        println("Adulto de $idade anos.")
    }
}
