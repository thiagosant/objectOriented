package com.sansoft.digionebank.test

import com.sansoft.digionebank.Manager

fun main() {
    val ashley = Manager("Ashley Lovelace", "456.456.456-50", 4000.00)
    PrintEmployeeReport.print(ashley)
}