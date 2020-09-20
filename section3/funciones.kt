/*
Introduccion a funciones en Kotlin
 */

fun main(args: Array<String>) {
    var resultado = suma(10, 8)
    println(resultado)

    val cosenoUno = Math.cos(1.0)
    println(cosenoUno)
}

fun suma(a:Int, b:Int):Int{

    return(a + b)
}