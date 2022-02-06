package com.sansoft.digionebank

class Analyst(personName: String,
              personCpf: String,
              employeeSalary: Double
): Employees(personName, personCpf, employeeSalary) {
    override fun calculationAssistance() = employeeSalary * 0.1
}