package com.codinghavoc.addressbook.data

import com.codinghavoc.addressbook.entities.Person
import java.util.*

class PersonData() {
    val personList:MutableList<Person> = mutableListOf<Person>()

    init {
//        personList.add(Person(1,"Rick","Grimes"))
//        personList.add(Person(2,"Lori","Grimes"))
//        personList.add(Person(3,"Carl","Grimes"))
//        personList.add(Person(4,"Daryl","Dixon"))
//        personList.add(Person(5,"Carol","Peletier"))
//        personList.add(Person(6,"Glenn","Rhee"))
//        personList.add(Person(7,"Maggie","Greene-Rhee"))

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