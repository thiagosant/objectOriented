package com.sansoft.digionebank.test

import com.sansoft.digionebank.ClientType

fun main() {
    ClientType.values().forEach { element ->
        println("${element.name} - ${element.description}")
    }

    ClientType.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val pf = ClientType.PF
    println(">>${pf.name} - ${pf.description}")
    val pj = ClientType.PJ
    println(">>${pj.name} - ${pj.description}")
}