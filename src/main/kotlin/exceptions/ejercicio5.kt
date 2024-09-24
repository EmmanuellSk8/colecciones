package org.example.exceptions

fun main (){
    try {
        val username = "abc"
        if (username.length < 5){
            throw Exception("InvalidUsernameException")
        }
    }catch (e: Exception){
        println("El nombre de usuario debe tener al menos 5 caracteres, Error: $e")
    }finally {
        println("Terminó el proceso")
    }
}