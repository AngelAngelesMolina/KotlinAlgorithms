package com.example.kotlinalgorithms.datastructures.maps

fun main() {
    val mapaDeNumeros = mutableMapOf("code1" to 1, "code2" to 2,  "code3" to 3, "code4" to 4)
    val kkey = mapaDeNumeros.mapKeys { it.key.uppercase() }
    println("MAPA -> $mapaDeNumeros")
    println("MAPA CLAVES -> ${mapaDeNumeros.keys}")
    println("MAPA VALORES -> ${mapaDeNumeros.values}")
    println(kkey)
    mapaDeNumeros["code5"] = 5 // we asign the value that correspond to that key
    mapaDeNumeros.put("code6", 6) //Adding new value with put(key, value)
    mapaDeNumeros.set("code7", 7) //Adding new value with set(key, value) LESS COMMON
    println("MAP WITH NEW VALUE -> $mapaDeNumeros")

    //**GETTING VALUE
    println("PARA LA CLAVE COD2 EL VALOR ES: ${mapaDeNumeros["code2"]}")
    println("PARA LA CLAVE COD2 (GET) EL VALOR ES: ${mapaDeNumeros.get("code2")}")
    println("PARA LA CLAVE COD2 (GET) EL VALOR ES: ${mapaDeNumeros.getOrDefault("code22", "No existe")}") // Get the value or default
    //!!REMOVE VALUE
    mapaDeNumeros.remove("code3")//We need to pass the key
    println("MAP WITH NEW VALUE -> $mapaDeNumeros")
    if("code3" in mapaDeNumeros){
        println("PARA LA CLAVE COD2 (GET) EL VALOR ES: ${mapaDeNumeros.get("code3")}")
    }else{
        println("No existe el valor!!".uppercase())
    }
    if(1 in mapaDeNumeros.values){ //Search in the values
        println("SE ENCONTRO EL VALOR 1")
    }else{
        println("No existe el valor 1!!")
    }
    if(mapaDeNumeros.containsValue(10)) println("Se encontro el numero 10") else println("No se encontro el 10")
    //Iterate maps
    println("-----------")
    for((key, value) in mapaDeNumeros){
        println("$key -> $value")
    }

}