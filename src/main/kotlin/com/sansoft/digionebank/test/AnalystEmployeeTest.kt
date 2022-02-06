package com.sansoft.digionebank.test

import com.sansoft.digionebank.Analyst
import com.sansoft.digionebank.Employees

fun main() {
    val joao = Analyst("João Tordo", "789.789.789-99", 2000.00)
    PrintEmployeeReport.print(joao)
}