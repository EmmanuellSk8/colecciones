package org.example

fun main() {
ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
    ejercicio7()
    ejercicio8()
    ejercicio9()
    ejercicio10()
    ejercicio11()
}

fun ejercicio1 () {
    println("Ejercicio #1")
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val nPares  = numeros.filter {it % 2 == 0}
    println(nPares)
}

fun ejercicio2 (){
    println("Ejercicio #2")
    val nombres = listOf("Juan", "María", "Ana", "Pedro")
    val nombresMayus = nombres.map { it.uppercase() }
    println(nombresMayus)
}

fun ejercicio3 (){
    println("Ejercicio #3")
    val numeros = listOf(1, 2, 3, 4, 5)
    val sumaTotal = numeros.sum()
    println(sumaTotal)
}

fun ejercicio4 (){
    println("Ejercicio #4")
    val nombres = listOf("Ana", "María", "Alberto", "Pedro",
        "Andrés")
    val nombresFilter = nombres. filter {it.startsWith("A")}
    println(nombresFilter)
}

fun ejercicio5 () {
    println("Ejercicio #5")
    val numeros = listOf(10, 20, 30, 40, 50)
    val primerosNumeros = numeros.take(3)
    println(primerosNumeros)

}

fun ejercicio6 (){
    println("Ejercicio #6")
    val claves = listOf("nombre", "edad", "profesión");
    val valores = listOf("Juan", 25, "Ingeniero")
    val transform = claves.zip(valores)
    println(transform)
}

fun ejercicio7 (){
    println("Ejercicio #7")
    val nombres = listOf("Ana", "María", "Juan", "Pedro", "Alberto")
    val ordenNombres = nombres.sortedBy { it.length }
    println(ordenNombres)
}

fun ejercicio8 (){
    println("Ejercicio #8")
    val nombres = listOf("Ana", "María", "Juan", "Pedro", "Alberto")
    val nombresMin = nombres.map { it.lowercase() }
    val nombresFilter = nombresMin.filter { it.length > 4 }
    println(nombresFilter)
}

fun ejercicio9 () {
    println("Ejercicio #9")
    data class Persona(val nombre: String, val edad: Int);
    val personas = listOf(Persona("Juan", 25), Persona("María", 32),
        Persona("Ana", 35), Persona("Pedro", 29))
    val filterPersona = personas.filter { it.edad > 29 }
    val personaMayor30 = filterPersona.map { it.nombre }
    println(personaMayor30)

}

fun ejercicio10 (){
    println("Ejercicio #10")
    val mapa = mapOf("nombre" to "Juan", "edad" to 25, "profesión" to
            "Ingeniero")
    val list = mapa.map { (clave, valor) -> "$clave: $valor" }

    println(list)
}

fun ejercicio11 ( ){
    println("Ejercicio #11")
    val palabras = listOf("perro", "gato", "perro", "pájaro", "gato", "perro")
    val totalPalabras = palabras.groupingBy { "$it to " }.eachCount()
    println(totalPalabras)
}