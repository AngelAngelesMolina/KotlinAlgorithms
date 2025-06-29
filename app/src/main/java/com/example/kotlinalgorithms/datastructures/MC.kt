package com.example.kotlinalgorithms.datastructures

fun main(){
    val bird = Bird()
    val cat = Cat()
    val fish = Fish()

    val animals: List<Any> = listOf(bird, cat, fish)

    animalAction(animals)
}


interface Flyable{
    fun fly()
}
interface Walkable{
    fun walk()
}
interface Swimmable{
    fun swim()
}

class Bird : Flyable, Walkable{
    override fun fly(){
        println("Bird can fly")
    }
    override fun walk(){
        println("Bird can walk")
    }
}
class Cat : Walkable{

    override fun walk(){
        println("Cat can walk")
    }

}
class Fish : Swimmable{
    override fun swim(){
        println("Fish can swim")
    }
}

fun animalAction(animals : List<Any>){
    for (animal in animals){
        if(animal is Flyable){
            animal.fly()
        }
        if(animal is Walkable){
            animal.walk()
        }
        if(animal is Swimmable){
            animal.swim()
        }
    }
}
