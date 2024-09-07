package com.codinghavoc.addressbook

import com.codinghavoc.addressbook.data.PersonData

class AddressBookMain {
    private var personList = PersonData()
    fun printMenu(){
        println("-> 1: View all contacts")
        println("-> 2: Add a new contact")
        println("-> 3: Remove a contacts")
        println("-> 4: Edit a contact")
        println("-> 0: Exit")
    }

    fun viewAllContacts(){
        println("Printing all Contacts")
        for (person in personList.personList){
            println(person.toString())
        }
    }

    fun addNewContact(){
        println("Adding a new Contact")
    }

    fun removeContacts(){
        println("Remove a Contact")
    }

    fun editContact(){
        println("Edit a Contact")
    }

}