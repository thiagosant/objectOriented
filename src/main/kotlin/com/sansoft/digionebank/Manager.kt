package com.sansoft.digionebank

class Manager(personName: String, personCpf: String, employeeSalary: Double) :
    Employees(personName, personCpf, employeeSalary) {
    override fun calculationAssistance(): Double = employeeSalary * 0.4
}