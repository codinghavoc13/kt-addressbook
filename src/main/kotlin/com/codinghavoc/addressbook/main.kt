package com.codinghavoc.addressbook

fun main(){
    println("Address Book Main")
    val adm = AddressBookMain()
    var input = "-1"
    while (!input.equals("0")){
        adm.printMenu()
        input = readln()
        when (input){
            "1" -> adm.viewAllContacts()
            "2" -> adm.addNewContact()
            "3" -> adm.removeContacts()
            "4" -> adm.editContact()
            "0" -> println("Goodbye")
            else -> println("That is not a valid option")
        }
    }
}