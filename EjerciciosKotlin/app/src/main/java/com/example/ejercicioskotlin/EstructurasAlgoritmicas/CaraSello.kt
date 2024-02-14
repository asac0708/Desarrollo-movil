package com.example.ejercicioskotlin.EstructurasAlgoritmicas

class CaraSello {
}

fun main(){

    println("¿Cuantas veces quiere jugar?: ")
    var nj:Int = readLine()!!.toInt()

    for(i in 1..nj){
        println("Turno ${i}")
        var result:Int=(1..2).random()

        println("Cara o sello: ")
        var opcion:String = readLine()!!.toString().uppercase()

        if(result==1 && opcion=="CARA") {
            println("Ganó")
        }else if(result==2 && opcion=="SELLO") {
            println("Ganó")
        }else{
            println("Perdió")
        }
    }
}