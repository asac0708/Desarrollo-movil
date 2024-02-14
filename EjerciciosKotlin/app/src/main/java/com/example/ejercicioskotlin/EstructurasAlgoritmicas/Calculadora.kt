package com.example.ejercicioskotlin.EstructurasAlgoritmicas

import kotlin.math.*
class Calculadora {
}

fun main(){
    println("Ingrese el primer numero: ")
    var n1:Double = readLine()!!.toDouble()

    println("Ingrese el segundo numero: ")
    var n2:Double = readLine()!!.toDouble()

    println("Para sumar oprima 1, para restar 2, para multiplicar 3, para dividir 4, para sacar las raices cuadradas 5")
    var sel:Int = readLine()!!.toInt()
    when(sel){
        1-> {
            var suma: Double = n1 + n2
            println("La suma es ${suma}")
        }
        2->{
            var resta: Double = n1 - n2
            println("La resta es ${resta}")
        }
        3->{
            var multiplicacion: Double = n1 * n2
            println("La multiplicacion es ${multiplicacion}")
        }
        4-> {
            var division: Double = n1 / n2
            println("La ${n1} dividido ${n2} es ${division}")
        }
        5->{
            var raiz1: Double = sqrt(n1)
            var raiz2: Double = sqrt(n2)
            println("La raiz cuadrada ${n1} es ${raiz1} , la raiz cuadrada de ${n2} es ${raiz2}")
        }6->{
            var pow: Double = Math.pow(n1,n2)
            println("${n1} a la ${n2} es ${pow}")
        }
        else->{
            "opción invalidad"
        }

    }
}