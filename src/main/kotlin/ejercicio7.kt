package org.example

fun main (){
    val nombres = listOf("Ana", "María", "Juan", "Pedro", "Alberto")
    val ordenNombres = nombres.sortedBy { it.length }
    println(ordenNombres)
}