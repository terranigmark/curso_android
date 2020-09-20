/*Clases */

class Frutas(color:String, sabor:String, precio:Int, frescura:Int){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var frescura:Int = 100

    init{
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
    }

    fun pudrirse(){
        print("La fruta se esta pudriendo")
        frescura -= 20
    }

    fun estado(){
        println("El estado de frescura es de: $frescura")
    }

}

fun main(args: Array<String>) {
    var manzana = Frutas("Rojo", "Dulce", 4, 100)

    print(manzana.color)

    manzana.pudrirse()
    manzana.estado()
}