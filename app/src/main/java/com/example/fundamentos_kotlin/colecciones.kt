package com.example.fundamentos_kotlin

import com.example.fundamentos_kotlin.clases.group
import com.example.fundamentos_kotlin.clases.user

fun main(){
    nueTopic("colecciones")
    nueTopic("solo lectura")
    val frutitas= listOf<String>("manzana","fresa", "uva")
    println(frutitas.get((0..frutitas.size-1).random()))
    println("index de uva es ${frutitas.indexOf("uva")}")

    nueTopic(" mutable list")
    val myUser= user(id = 0, name = "sara", lastname = "blanco", group.FAMILY.ordinal)
    val bro=myUser.copy(1,"jorge")
    val friend=bro.copy(id = 2, group = group.FRIEND.ordinal)
    val userlist= mutableListOf(myUser,bro)
    println(userlist)
    userlist.add(friend)
    println(userlist)
    userlist.removeAt(1)
    println(userlist)

    val userSelectedlist= mutableListOf<user>()
    println(userSelectedlist)
    userSelectedlist.add(myUser)
    println(userSelectedlist)
    userSelectedlist.set(0,bro)
    println(userSelectedlist)
}

