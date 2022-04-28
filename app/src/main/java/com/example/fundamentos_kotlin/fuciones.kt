package com.example.fundamentos_kotlin

import java.lang.Thread.sleep
import kotlin.concurrent.thread
import kotlin.math.abs
import kotlin.random.Random

fun main(){
    hello()
    nueTopic("argumentos")
    val a=2
    val b=3
    val d=18
    val e=7.99
    print("$a+$b=${sumar(a, b)}\n")
    print("$d-$e=${restar(d,e)}\n")
    sumar1(2,2){ x->

        print("resulatd0 $x")

        nueTopic("Infix")
        val c=-3
        println(c.enableAbs(false))
        println("$a+$c=${sumar(a,c.enableAbs(false))}")
        println("$a+$c=${sumar(a,c.enableAbs(true))}")
        nueTopic("sobrecar")
        sobrecarga("soda", "10%")
        sobrecarga("pan")
        sobrecarga("jugo", validity = "15 marzo")
    }
}

private fun hello(){ //unit para no retornar valores
    print("newton")
}
fun sumar1(a:Int , b:Int, x: (Any) -> Unit){
    run {

        print("peticion al bckend......\n")
        sleep(Random.nextLong(2000,5000))
        print("devuelta del bckend.......\n")
        sleep(Random.nextLong(2000,5000))
        print("procesando peticion del bckend.......\n")
        sleep(Random.nextLong(2000,5000))
        x(a+b)
    }
}// optimizar- se elimina el return
fun sumar(a:Int , b:Int)=a+b// optimizar- se elimina el return
       //fun sumar(a:Int , b:Int): Int{
      //return (a+b)
     // }
fun restar(d:Int, e: Double): Any{
    return (d-e)
}
//enable=parametro                        arreglo para permitir el negativo
infix fun Int.enableAbs(enable:Boolean)= if (enable) abs(this) else this

fun sobrecarga(name:String, promo: String=" sin promo", validity:String="agotar existencia"){
    println("$name=$promo hasta $validity")
}
