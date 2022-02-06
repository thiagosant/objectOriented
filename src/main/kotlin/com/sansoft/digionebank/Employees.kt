package com.sansoft.digionebank

abstract class Employees(
    override val personName: String,
    override val personCpf: String,
    val employeeSalary: Double
) : Person(personName, personCpf) {
    protected abstract fun calculationAssistance(): Double

    override fun toString(): String = "" +
            "Name: $personName" +
            "\nCPF: $personCpf" +
            "\nSalary: R$$employeeSalary" +
            "\nAssistance: R$${calculationAssistance()}" +
            "".trimIndent()
}