package com.sansoft.digionebank

data class Bank(val bankName: String, val bankNumber: Int) {
    fun info () = "$bankName and number $bankNumber"

}
