package org.example.colecciones

fun main (){
    val nombres = listOf("Juan", "María", "Ana", "Pedro")
    val nombresMayus = nombres.map { it.uppercase() }
    println(nombresMayus)
    }
