package com.sansoft.digionebank

class Client(personName: String, personCpf: String, val clientType: ClientType, val password: String) : Person(personName, personCpf), Logable{
    override fun login(): Boolean = "123456" == password

    override fun toString(): String = "" +
            "Name: $personName" +
            "\nCPF: $personCpf" +
            "\nType: ${clientType.description}" +
            "".trimIndent()
}