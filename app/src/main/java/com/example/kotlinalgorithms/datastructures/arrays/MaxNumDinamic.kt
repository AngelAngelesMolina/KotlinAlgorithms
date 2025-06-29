package com.example.kotlinalgorithms.datastructures.arrays

/*1. Pedir al humano que ingrese una lista de numeros separados por comas
2. Separar cada numero ingresado por comas y convertir a numero
3. Buscar y mostrar numero mayor */

fun main() {
    var maxNumber = 0

    val mData = getData()
    var listnumbers = mData.split(",".toRegex()).toTypedArray()
    var listnumbersInt = IntArray(listnumbers.size)

    for(i in listnumbers.indices){
        listnumbersInt[i] = listnumbers[i].toInt()
    }
    println( "El numero mayor es: ${ findMaxNumberDinamic(listnumbersInt) }")

}
fun findMaxNumberDinamic(mList : IntArray) : Int{
    var maxNumber = 0
    if(mList.isEmpty()) return 0
    else {
        maxNumber = mList[0]
        for (i in mList) {
            if (i > maxNumber) maxNumber = i
        }
    }
    return maxNumber
}

fun getData() :String {
    println("Ingresa una lista de numeros separados por comas")
    var mData = readLine().toString()
    return mData
}