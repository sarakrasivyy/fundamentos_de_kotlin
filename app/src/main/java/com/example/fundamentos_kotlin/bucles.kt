package com.example.fundamentos_kotlin

fun main (){
    nueTopic("bucles")
    personas("sara", "mauro", "laura")
    personas("karol","camila","cristina", "mery")

}
fun personas(p1:String, p2: String, p3:String){
    println(p1)
    println(p2)
    println(p3)
}
//recibir datos
fun personas(vararg personas:String){
    nueTopic("for")
    for (persona in personas)
    println(personas[0])
    println(personas[1])
    println(personas[2])
    println(personas[3])



    nueTopic("while")
        var index = 0
    while (index<personas.size)
    {
        if (personas[index]=="camila") println("hello camila")
        println(personas[index])
        index ++

    }
nueTopic("when")
    index=(0..personas.size-1).random()
    println(index)
    when (personas[index]){
        "karol" -> println("hello true")
        "cristina"-> {
            println("ir a otro lugar")
            println(2+4)
        }
    else -> println(personas[index])
    }

}