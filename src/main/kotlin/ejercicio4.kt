package org.example

fun main (){
    val nombres = listOf("Ana", "María", "Alberto", "Pedro",
        "Andrés")
    val nombresFilter = nombres. filter {it.startsWith("A")}
    println(nombresFilter)
}