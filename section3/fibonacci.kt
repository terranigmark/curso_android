/*Secuencia de Fibonacci */

fun main(args: Array<String>) {
    var number = 18
    fibonacci(number, a:Int = 0, b:Int = 1)
}

fun fibonacci(number:Int, a:Int = 0, b:Int = 1):Int {
    var a = 0
    var b = 1
    var counter = 0
    var total:Int = 0

    while(counter <= number){
        println(a)
        println(b)
        total = a + b

        a = a + b
        b = a + b

        counter += 1
        }

    return total
    }
