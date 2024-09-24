package org.example.exceptions

fun  main (){
   try {
       val edad = 150
       val rango = 0..120
       if (edad < 0 || edad > 120 ){
        throw IllegalArgumentException("La edad debe estar entre 0 y 120")
       }
   }catch (e: IllegalArgumentException){
       println(e)
   }finally {
       println("Terminó el proceso...")
   }

}
