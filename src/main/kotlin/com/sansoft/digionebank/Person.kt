package com.sansoft.digionebank

class Person {
    var name: String = "Thiago"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val thiago = Person()

    println(thiago.name)
    println(thiago.cpf)
}