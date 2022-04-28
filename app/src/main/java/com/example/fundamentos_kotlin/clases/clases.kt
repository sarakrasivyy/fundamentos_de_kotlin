package com.example.fundamentos_kotlin.clases

import com.example.fundamentos_kotlin.nueTopic

fun main (){
    nueTopic("clases")
    val telefono: telefono= telefono(12345)
    telefono.call()
    telefono.numbertre()

    nueTopic("herencia")
    val smarphone= smarphone(34567, true)
    smarphone.call()
    nueTopic("sobreescritura")
    smarphone.numbertre()
    println("privado ${smarphone.isPrivate}")

    nueTopic("data clase")
    val myUser= user(id = 0, name = "sara", lastname = "blanco", group = 0)
    println(myUser.component2())
    println(myUser)
}