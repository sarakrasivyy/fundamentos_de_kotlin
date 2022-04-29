package com.example.fundamentos_kotlin

import com.example.fundamentos_kotlin.clases.Group
import com.example.fundamentos_kotlin.clases.user

fun main(){
    nueTopic("colecciones")
    nueTopic("solo lectura")
    val frutitas= listOf<String>("manzana","fresa", "uva")
    println(frutitas.get((0..frutitas.size-1).random()))
    println("index de uva es ${frutitas.indexOf("uva")}")

    nueTopic(" mutable list")
    val myUser= user(id = 0, name = "sara", lastname = "blanco", Group.FAMILY.ordinal)
    val bro=myUser.copy(1,"jorge")
    val friend=bro.copy(id = 2, group = Group.FRIEND.ordinal)
    val userlist= mutableListOf(myUser,bro)
    println(userlist)
    userlist.add(friend)
    println(userlist)
    userlist.removeAt(1)
    println(userlist)

    val userSelectedlist= mutableListOf<user>()
    println(userSelectedlist)
    userSelectedlist.add(myUser)

    for (i in 0..50){
        userSelectedlist.add(
            user(id = i.toLong(), name = "sara $i", lastname = "blanco$i", group.FAMILY.ordinal)
        )
    }

    userSelectedlist.find { it.id == 5L }.let {
        println(" find $it \n ------")
    }

    println(" filter  forEach------")
    userSelectedlist.filter { it.id in 11..29 }.forEach {
        println("$it \n")
    }

    println("------")
    userSelectedlist.forEach {
        println("$it \n")
    }
    println("------")*/

/*    userSelectedlist.add(bro)
    println(userSelectedlist)
    //userSelectedlist[0] = bro
    //println(userSelectedlist)

    print(userSelectedlist.first())
    println(userSelectedlist[0])
    userSelectedlist.removeAt(0)*/

}

