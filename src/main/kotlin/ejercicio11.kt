package org.example

fun main ( ){
    val palabras = listOf("perro", "gato", "perro", "pájaro", "gato", "perro")
    val totalPalabras = palabras.groupingBy { "$it to " }.eachCount()
    println(totalPalabras)
}