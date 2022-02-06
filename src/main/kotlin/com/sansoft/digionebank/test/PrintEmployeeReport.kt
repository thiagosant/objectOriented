package com.sansoft.digionebank.test

import com.sansoft.digionebank.Employees

class PrintEmployeeReport {
    companion object {
        fun print(employees: Employees){
            println(employees.toString())
        }
    }
}