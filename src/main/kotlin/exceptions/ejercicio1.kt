package org.example.exceptions

fun main (){
    try {
        val numerador = 10
        val divisor = 0
        val result = numerador / divisor

    }
    catch (e: Exception){
        println("La división por 0 es inválida, Error: $e")
    }
    finally {
        println("Terminó el proceso...")
    }
}