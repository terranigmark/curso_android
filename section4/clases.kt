/*Clases */

open class Frutas(){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var frescura:Int = 100
    var numHojas:Int = 0

    /*init{
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
    }*/

    constructor(color:String, sabor:String, precio:Int, frescura:Int):this(){

        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura

    }

    constructor(color:String, sabor:String, precio:Int, frescura:Int, numHojas:Int):this(){

        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
        this.numHojas = numHojas

    }

    fun pudrirse(){
        println("La fruta se esta pudriendo")
        frescura -= 20
    }

    fun estado(){
        println("El estado de frescura es de: $frescura")
    }

}

class FrutasConGrasa():Frutas(){
    var cantidadGrasa:Int = 0

    constructor(grasa:Int):this(){
        this.cantidadGrasa = grasa
    }
}

fun main(args: Array<String>) {
    var manzanaConHojas = Frutas("Rojo", "Dulce", 4, 100, 2)
    var manzanaSinHojas = Frutas("Rojo", "Dulce", 4, 0, 0)
    var aguacate = FrutasConGrasa(10)

    aguacate.color = "verde"

    println(manzanaConHojas.color)
    println(manzanaSinHojas.numHojas)
    println(aguacate.cantidadGrasa)
    println(aguacate.color)

    manzanaConHojas.pudrirse()
    manzanaSinHojas.estado()
    aguacate.pudrirse()
}