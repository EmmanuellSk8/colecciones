package org.example

fun main (){
    val nombres = listOf("Ana", "María", "Juan", "Pedro", "Alberto")
    val nombresMin = nombres.map { it.lowercase() }
    val nombresFilter = nombresMin.filter { it.length > 4 }
    println(nombresFilter)
}