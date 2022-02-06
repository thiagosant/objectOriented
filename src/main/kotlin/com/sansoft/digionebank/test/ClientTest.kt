package com.sansoft.digionebank.test

import com.sansoft.digionebank.Client
import com.sansoft.digionebank.ClientType

fun main() {
    val jose = Client(
        personName = "José da Silva",
        personCpf = "123.123.123-60",
        clientType = ClientType.PF,
        password = "123456"
    )

    println(jose)
    AuthenticationTest().authenticate(jose)
}