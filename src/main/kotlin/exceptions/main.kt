package org.example.exceptions

import java.io.File
import java.io.FileNotFoundException


fun main() {
    println("Ejercicio 1")
    ejercicio1()

    println("Ejercicio 2")
    ejercicio2()

    println("Ejercicio 3")
    ejercicio3()

    println("Ejercicio 4")
    ejercicio4()

    println("Ejercicio 5")
    ejercicio5()

    println("Ejercicio 6")
    ejercicio6()

    println("Ejercicio 7")
    ejercicio7()

}


fun ejercicio1() {

    try {
        val numerador = 10
        val divisor = 0
        val result = numerador / divisor

    } catch (e: Exception) {
        println("La división por 0 es inválida, Error: $e")
    } finally {
        println("Terminó el proceso...")
    }
}

fun ejercicio2() {
    try {
        val cadena = "123a"
        val stringToInt = cadena.toInt()
    } catch (e: Exception) {
        println("La entrada no es válida, solo se permiten números, Error: $e")
    } finally {
        println("Terminó el proceso")
    }

}

fun ejercicio3() {
    try {
        val edad = 150
        val rango = 0..120
        if (edad < 0 || edad > 120) {
            throw IllegalArgumentException("La edad debe estar entre 0 y 120")
        }
    } catch (e: IllegalArgumentException) {
        println(e)
    } finally {
        println("Terminó el proceso...")
    }
}

fun ejercicio4() {
    fun leerArchivo(ruta: String) {
        try {

            val contenido = File(ruta).readText()
            println(contenido)

        } catch (e: FileNotFoundException) {

            println("El archivo no fue encontrado.")
        } catch (e: Exception) {

            println(e)
        } finally {
            println("Se terminó el proceso.")
        }
    }

    fun main() {
        val archivo = "archivo_inexistente.txt"
        leerArchivo(archivo)
    }

}

fun ejercicio5() {
    try {
        val username = "abc"
        if (username.length < 5) {
            throw Exception("InvalidUsernameException")
        }
    } catch (e: Exception) {
        println("El nombre de usuario debe tener al menos 5 caracteres, Error: $e")
    } finally {
        println("Terminó el proceso")
    }
}

fun ejercicio6() {

    try {
        val numeros = listOf<Int>()
        if (numeros.isEmpty()) {
            throw IllegalArgumentException("La lista no puede estar vacía")
        }
    } catch (e: IllegalArgumentException) {
        println(e)
    } finally {
        println("Terminó el proceso.")
    }
    try {

        val numeros = listOf<Int>()
        if (numeros.isEmpty()) {
            throw IllegalArgumentException("La lista no puede estar vacía")
        }
    } catch (e: IllegalArgumentException) {
        println(e)
    } finally {
        println("Terminó el proceso.")
    }
}

fun ejercicio7() {
    try {
        val numerador = "10"
        val divisor = "abc"
        val stringToInt1 = numerador.toIntOrNull()
        val stringToInt2 = divisor.toIntOrNull()


        if (stringToInt1 == null) {
            throw NumberFormatException("La cadena no puede convertirse a un número")
        }

        if (stringToInt2 == null) {
            throw NumberFormatException("La cadena no puede convertirse a un número")
        }

        if (stringToInt2 == 0) {
            throw ArithmeticException("No es posible dividir por cero")
        }


        val result = stringToInt1 / stringToInt2

    } catch (e: Exception) {
        println(e)
    } finally {
        println("Se terminó el proceso.")
    }
}