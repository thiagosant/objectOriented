package com.sansoft.digionebank

class Person {
    var name: String = "Thiago"
    var cpf: String = "123.123.123-11"

    private set

    constructor()

    fun personInfo() = "$name e $cpf"

}

fun main() {
    val thiago = Person()

    println(thiago.personInfo())
}