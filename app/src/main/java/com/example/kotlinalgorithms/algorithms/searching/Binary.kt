package com.example.kotlinalgorithms.algorithms.searching

fun main() {

    println("Ingresa el numero a buscar:")
    var numeroBuscar = readLine()!!.toInt()

    var listaNumeros = IntArray(7)
    for (i in 0 until listaNumeros.size) {
        println("Ingresa el numero ${i + 1}:")
        listaNumeros[i] = readLine()!!.toInt()
    }

    var n = listaNumeros.size
    var inf = 0
    var centro = 0
    var sup = n - 1
    var encontrado = false
    while (inf <= sup) {
        centro = (inf + sup) / 2
        if (numeroBuscar == listaNumeros[centro]) {
            encontrado = true
            break
        } else if (
            numeroBuscar < listaNumeros[centro]
        ) {
            sup = centro - 1
        } else {
            inf = centro + 1
        }
    }
    if (encontrado) {
        println("El numero $numeroBuscar se encuentra en la posicion ${centro + 1}")
    } else {
        println("El numero $numeroBuscar no se encuentra en la lista")
    }

}