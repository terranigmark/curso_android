/*Estructuras de control:
Introducci'on a operadores aritmeticos, de comparacion y logicos
 */

fun main(args: Array<String>) {
    // matematicos: + - / *
    // logicos: < > == <= >= !
    /* ! && || */

    var a = 8
    var b = 8
    var c = 7
    var datoBooleano = a != b

    println(a == b && c > a)
    println(a != b && c < a)
    println(a == b || c < a)
    println((a == b || c < a) && (b == c))
    println((a == b || c < a) || (b == c))
}