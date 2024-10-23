package com.codinghavoc.addressbook.data

import com.codinghavoc.addressbook.entities.Person
import java.util.*

class PersonData() {
    val personList:MutableList<Person> = mutableListOf<Person>()

    init {
        addContact(Person("Rick","Grimes"))
        addContact(Person("Lori","Grimes"))
        addContact(Person("Carl","Grimes"))
        addContact(Person("Daryl","Dixon"))
        addContact(Person("Carol","Peletier"))
        addContact(Person("Glenn","Rhee"))
        addContact(Person("Maggie","Greene-Rhee"))

        personList.sortWith(compareBy<Person>{it.getLastName()}.thenBy{it.getFirstName()})
    }

    private fun addContact(person: Person){
        if(personList.isEmpty()){
            person.setId(1)
        } else {
        val newId = personList.maxByOrNull { it.getId() }!!.getId()
        person.setId(newId + 1)
            }
        personList.add(person)
    }

}