package com.example.kotlinalgorithms.algorithms.sorting

fun main() {
    var listaNumeros = IntArray(5)
    for (i in 0 until listaNumeros.size) {
        println("Ingresa el numero ${i + 1}:")
        listaNumeros[i] = readLine()!!.toInt()
    }
    println("Mi lista tiene una longitud de ${listaNumeros.size}")

    var menor = 0
    var posMenor = 0
    var temp = 0
    for (i in 0 until listaNumeros.size - 1) {
        menor = listaNumeros[i]
        posMenor = i
        for (j in (i + 1) until listaNumeros.size) {
            if (listaNumeros[j] < menor) {
                menor = listaNumeros[j]
                posMenor = j
            }
        }
        if (posMenor != i) {
            temp = listaNumeros[i]
            listaNumeros[i] = listaNumeros[posMenor]
            listaNumeros[posMenor] = temp
        }
    }
    println("Aqui esta tu lista odenada ${listaNumeros.joinToString(",")}")
    println("Aqui esta tu lista odenada desc ${descList(listaNumeros).joinToString(",")}")
}


private fun descList(mLista: IntArray): IntArray {
    var descList = IntArray(mLista.size)
    for (i in mLista.size - 1 downTo 0) {
        descList[i] = mLista[i]
    }
    return descList;
}
