package com.example.fundamentos_kotlin.clases

class smarphone (number: Int, val isPrivate: Boolean):telefono(number){
    override fun numbertre() {
        if (isPrivate) println("desconocido") else super.numbertre()

    }
}