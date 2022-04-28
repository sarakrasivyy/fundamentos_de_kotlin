package com.example.fundamentos_kotlin

fun main (){

    nueTopic("hi")
  //  print("hello moto")
}

fun nueTopic(topic: String){
    println()
    print("*************** ")
    print(topic)
    print(" ***************")
    println()
// reducir lineas (b.p)
// para llamar metodo usar $
    println("\n*************** $topic ****************\n")
}