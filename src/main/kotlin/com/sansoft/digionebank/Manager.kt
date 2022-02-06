package com.sansoft.digionebank

class Manager(personName: String, personCpf: String, employeeSalary: Double, val password: String) :
    Employees(personName, personCpf, employeeSalary), Logable {
    override fun calculationAssistance(): Double = employeeSalary * 0.4

    override fun login(): Boolean = "senha123" == password
}