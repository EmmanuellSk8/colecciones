package org.example.exceptions
import java.io.File
import java.io.FileNotFoundException

fun leerArchivo(ruta: String) {
    try {

        val contenido = File(ruta).readText()
        println(contenido)

    } catch (e: FileNotFoundException) {

        println("El archivo no fue encontrado.")
    } catch (e: Exception) {

        println(e)
    }finally {
        println("Se terminó el proceso.")
    }
}

fun main() {
    val archivo = "archivo_inexistente.txt"
    leerArchivo(archivo)
}
