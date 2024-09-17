package org.example

fun main () {
    data class Persona(val nombre: String, val edad: Int);
     val personas = listOf(Persona("Juan", 25), Persona("María", 32),
            Persona("Ana", 35), Persona("Pedro", 29))
    val filterPersona = personas.filter { it.edad > 29 }
    val personaMayor30 = filterPersona.map { it.nombre }
    println(personaMayor30)

}