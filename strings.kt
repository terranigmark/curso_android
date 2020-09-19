/*Tipos de datos: Strings con secuencia de escape y Strings puros (raw Strings)

    var cadena:String = "Hector\n\tVega"
    var cadena_pura:String = """Hector

            Vega"""

    println(cadena)
    println(cadena_pura)
 */

fun main(args: Array<String>){

    var cadena1:String = "Hector"
    var cadena2:String = " Vega"
    var dinero:Int = 10

    println("Mi nombre es: $cadena1 y tengo ${'$'}$dinero dolares")
}