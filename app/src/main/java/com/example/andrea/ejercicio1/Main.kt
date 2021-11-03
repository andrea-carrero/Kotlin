package com.example.andrea.ejercicio1
fun main(){

    //crear objeto

    val operaciones: Operaciones
    operaciones = Operaciones(25, 35, 16)

    //llamar clases

    operaciones.suma()
    operaciones.resta()
    operaciones.multiplicacion()
}

class Operaciones(val A:Int, val B:Int, val C:Int) {

    fun suma() {
        val resultado = A + B + C
        println("El resultado es: $resultado")
        //println(A + B + C)
    }

    fun resta() {
        val resultado = A - B - C
        println("El resultado es: $resultado")
        //println(A - B - C)
    }

    fun multiplicacion() {
        val resultado = A * B * C
        println("El resultado es: $resultado")
        //println(A * B * C)
    }
}

var numeroUno = 4
val numeroDos = 5
val nombre ="casa"