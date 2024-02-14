package com.example.ejercicioskotlin.EstructurasAlgoritmicas

class Ejercicio1 {
}

fun main(){
    /*println("Ingrese un numero: ")
    var n1:Int = readLine()!!.toInt()
    if(n1 in 1..10){

        println("el número ${n1} está dentro del rango")
    }else{
        println("El número ${n1} no está dentro del rango")
    }
*/
   /* println("Ingrese una letra: ")
    var n1:String = readLine()!!.toString()
    if(n1 in "a".."f"){

        println("el número ${n1} está dentro del rango")
    }else{
        println("El número ${n1} no está dentro del rango")
    }
*/
    /*var result:Int=(0..50).random()
    println(result)
    when(result){
        0-> println("No hay resultados")
        1,2,3,4,5,6 -> println("El resultado está entre 1 u 6")
        in 7..40 -> println("Está entre 7 y 50")
        else -> println("Fuera de rango")
    }
*/
    for(i in 3..6 step 2){
        println("${i}")
    }
}