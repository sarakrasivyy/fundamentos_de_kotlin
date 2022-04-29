package com.example.fundamentos_kotlin.clases

import com.example.fundamentos_kotlin.nueTopic



fun main (){
    nueTopic("clases")
    val telephone: Telephone= Telephone(12345)
    telephone.call()
    telephone.numbertre()

    nueTopic("herencia")
    val smarphone= smarphone(34567, true)
    smarphone.call()
    nueTopic("sobreescritura")
    smarphone.numbertre()
    println("privado ${smarphone.isPrivate}")

    nueTopic("data clase")
    val myUser= user(id = 0, name = "sara", lastname = "blanco", group.FAMILY.ordinal)
    val bro=myUser.copy(1,"jorge")
    val friend=bro.copy(id = 2, group = group.FRIEND.ordinal)
    println(myUser.component2())
    println(myUser)
    println(bro)
    println(friend)

    nueTopic("funciones de alcance")
    with(smarphone){
        println("privadito $isPrivate")
        call()
    }
    friend.apply {
        group= com.example.fundamentos_kotlin.clases.group.WORK.ordinal
        name="ana"
        lastname="perez"
    }
    println(friend)
}