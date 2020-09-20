/*when */

fun main(args: Array<String>) {

    val calificacion = 5
    var resena:String

    when (calificacion){
        //1 -> resena = "No me gusto la comida, me causo malestar"
        //2 -> resena = "No me gusto, pero la bebida si"
        //calificacion >= 1 ...
        in 1..5 -> {println("El cliente califico con $calificacion estrellas")
            resena = "Mediocre"}
        //4 -> resena = "Me gusto pero puede mejorar"
        //5 -> resena = "La mejor comida mexicana en mucho tiempo"
        //'A' -> ...
        else -> resena = "Resena mal escrita"
    }

    print(resena)
}