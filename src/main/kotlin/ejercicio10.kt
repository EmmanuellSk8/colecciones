package org.example

fun main (){
    val mapa = mapOf("nombre" to "Juan", "edad" to 25, "profesión" to
            "Ingeniero")
    val list = mapa.map { (clave, valor) -> "$clave: $valor" }

    println(list)
}