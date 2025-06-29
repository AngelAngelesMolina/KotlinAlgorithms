package com.example.kotlinalgorithms.datastructures.arrays

/*Crear 2 arreglos y se combinaran en un tercer arreglo de la siguiente forma

        1. Declararemos 3 arreglos, a, b y c donde a y b tendrán un tamaño de 5 y c tendrá un tamaño de 10
        2. Crearemos dos bucles de 0 a 4 donde pediremos al humano que ingrese los valores del arreglo "a" y "b" respectivamente.
        3. Con un tercer bucle llenaremos el tercer arreglo "c" que contendr[a la combinacion de a y b
        4. Mostrar el resultado del arreglo c
        */

fun main(){
    val array1 = IntArray(5)
    val arrayb = IntArray(5)

    getDataFromUser(array1)
    getDataFromUser(arrayb)
    displayDataToUser(combinateArrays(array1, arrayb))

}
fun displayDataToUser(mArray : IntArray){
    for (i in mArray.indices){
        println(mArray[i])
    }
}

fun getDataFromUser(mArray : IntArray){
    println("----------------")
    for(i in 0 until mArray.size){
        println("Ingresa el valor del indice ${i + 1}")
        mArray[i] = readLine()!!.toInt()
    }
    println("----------------")
}

fun combinateArrays(array1 : IntArray, array2 : IntArray) : IntArray {
    val array3 = IntArray(array1.size + array2.size)
    var j = 0
    for(i in 0 until array1.size){
        array3[j++] = array1[i]
        array3[j++] = array2[i]
    }
    return array3
}
