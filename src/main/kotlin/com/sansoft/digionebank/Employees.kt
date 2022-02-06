package com.sansoft.digionebank

import java.math.BigDecimal

abstract class Employees(
    override val personName: String,
    override val personCpf: String,
    val employeeSalary: BigDecimal
) : Person(personName, personCpf) {
    abstract fun calculationAssistance();
}