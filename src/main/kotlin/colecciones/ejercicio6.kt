package org.example.colecciones

fun main (){
    val claves = listOf("nombre", "edad", "profesión");
    val valores = listOf("Juan", 25, "Ingeniero")
    val transform = claves.zip(valores)
    println(transform)
}