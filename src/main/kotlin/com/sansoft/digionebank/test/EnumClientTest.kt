package com.sansoft.digionebank.test

import com.sansoft.digionebank.ClientType

fun main() {
    ClientType.values().forEach { element ->
        println("${element.name} - $element")
    }

    ClientType.values().forEach {
        println("${it.name} - $it")
    }
}