package com.example.kotlinalgorithms.algorithms.searching

fun main() {
    println("Ingresa el numero a buscar:")
    var numeroBuscar = readLine()!!.toInt()

    var listaNumeros = IntArray(7)
    for (i in 0 until listaNumeros.size) {
        println("Ingresa el numero ${i + 1}:")
        listaNumeros[i] = readLine()!!.toInt()
    }

    var pos = 0 //posicion inicial
    var bandera = false //encontrada?

    while (!bandera && pos < listaNumeros.size) {
        if (numeroBuscar == listaNumeros[pos]) {
            bandera = true
            break
        }
        pos++
    }

    if (bandera) {
        println("El numero $numeroBuscar se encuentra en la posicion ${pos + 1}")
    } else {
        println("El numero $numeroBuscar no se encuentra en la lista")
    }

}