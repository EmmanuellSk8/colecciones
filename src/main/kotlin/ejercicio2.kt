package org.example

import java.util.*
import kotlin.text.HexFormat

fun main (){
    val nombres = listOf("Juan", "María", "Ana", "Pedro")
    val nombresMayus = nombres.map { it.uppercase() }
    println(nombresMayus)
    }
