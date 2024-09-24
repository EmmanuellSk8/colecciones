package org.example.exceptions

fun main (){
    try {

        val numeros = listOf<Int>()
        if (numeros.isEmpty()){
            throw IllegalArgumentException("La lista no puede estar vacía")
        }
    }catch (e: IllegalArgumentException){
        println(e)
    }finally {
        println("Terminó el proceso.")
    }
}