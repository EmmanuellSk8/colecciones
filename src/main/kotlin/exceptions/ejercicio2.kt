package org.example.exceptions

fun main (){
    try {
        val cadena = "123a"
        val stringToInt = cadena.toInt()
    }
    catch (e:Exception){
        println("La entrada no es válida, solo se permiten números, Error: $e")
    }
    finally {
        println("Terminó el proceso")
    }
}