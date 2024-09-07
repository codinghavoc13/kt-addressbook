package com.codinghavoc.addressbook.entities

class Person(private var firstName: String, private var lastName: String) {
    private var id: Int = 0

    fun setFirstName(fn: String) {
        firstName = fn
    }

    fun getFirstName():String{
        return firstName
    }

    fun setLastName(ln: String) {
        lastName = ln
    }

    fun getLastName():String{
        return lastName
    }

    fun getId():Int{
        return id;
    }

    fun setId(newId: Int){
        id = newId
    }

    fun compareTo(other: Person): Int {
        var result = other.lastName.compareTo(lastName)
        if (result == 0){
            result = other.firstName.compareTo(firstName)
        }
        return result
    }

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', id=$id)"
    }

//    override fun toString(): String {
//        return "Person(firstName='$firstName', lastName='$lastName')"
//    }


}