package org.example.exceptions

fun main (){
  try {
      val numerador = "10"
      val divisor = "abc"
      val stringToInt1 = numerador.toIntOrNull()
      val stringToInt2 = divisor.toIntOrNull()


      if (stringToInt1 == null){
          throw NumberFormatException("La cadena no puede convertirse a un número")
      }

      if (stringToInt2 == null){
          throw NumberFormatException("La cadena no puede convertirse a un número")
      }

      if (stringToInt2 == 0){
          throw ArithmeticException("No es posible dividir por cero")
      }


      val result = stringToInt1 / stringToInt2

  }catch (e:Exception){
      println(e)
  }finally {
      println("Se terminó el proceso.")
  }
}