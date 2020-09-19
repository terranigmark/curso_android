/*
a) a > 3                        true
b) a > b                        true
c) a < c                        false
d) c < b                        true
e) b != a                       true
f) a == 8                       false
g) b * c == 18                  false
h) a * b == -30                 false
i) c / b < a                    true
j) c / b == -11                 false
k) c / b == -4                  true
l) a + c + b == 5               false
m) (a+b == 8) && (a-b == 2)     true
n) (a+b == 8) || (a-b == 6)     true
o) a > 3 && b > 4 && c < 3      false
p) a > 3 && b >= 3 && c < -3    true
 */

fun main(args: Array<String>) {

    var a = 5
    var b = 3
    var c = -12

    println(a > 3)
    println(a > b)
    println(a < c)
    println(c < b)
    println(b != a)
    println(a == 8)
    println(b * c == 18)
    println(a * b == -30)
    println(c / b < a)
    println(c / b == -11)
    println(c / b == -4)
    println(a + c + b == 5)
    println((a+b == 8) && (a-b == 2))
    println((a+b == 8) || (a-b == 6))
    println(a > 3 && b > 4 && c < 3)
    println(a > 3 && b >= 3 && c < -3)
}