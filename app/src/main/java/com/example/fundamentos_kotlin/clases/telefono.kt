package com.example.fundamentos_kotlin.clases

open class telefono (protected val number:Int){
    fun call(){
        println("llamando...")
    }
  open  fun numbertre(){
        println("a $number")
    }
}