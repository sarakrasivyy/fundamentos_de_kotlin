package com.example.fundamentos_kotlin

val separador="******************"
// funcion principal
fun main (){

    nueTopic("hi")
    nueTopic("variables y constantes")
    //constantes
    val a=2
    println("a=$a")
    // variable
    var b=3
    println("b=$b")


    var obNull: Any? // Any para declarar cualquier objeto
    obNull=null
    obNull="cheese"
    print(obNull)

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
    println("\n$separador $topic $separador\n")
}