package com.sansoft.digionebank.test

import com.sansoft.digionebank.Bank

fun main() {
    val digiOneBank = Bank("Digione",  12)

    println(digiOneBank.bankName)
    println(digiOneBank.bankNumber)

    val bank2 = digiOneBank.copy(bankName = "Bank 2")

    println(bank2.info())
}