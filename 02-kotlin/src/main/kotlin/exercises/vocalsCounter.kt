package exercises

/*
Crea una función que reciba una cadena de texto y devuelva un Map con el conteo de cada vocal (a, e, i, o, u).
Pide al usuario que introduzca una frase y muestra los resultados.

Ejemplo de entrada/salida:

a: 1
e: 3
i: 4
o: 3
u: 0

 */

fun main() {
    println("Introduce una frase: ")
    val phrase = readln()
    vocalsCount(phrase)
}

fun vocalsCount(phrase: String) {
    var a = 0
    var e = 0
    var i = 0
    var o = 0
    var u = 0

    phrase.map {
        if (it.equals('a', true))
            a++
        if (it.equals('e', true))
            e++
        if (it.equals('i', true))
            i++
        if (it.equals('o', true))
            o++
        if (it.equals('u', true))
            u++
    }

    println("a: $a")
    println("e: $e")
    println("i: $i")
    println("o: $o")
    println("u: $u")


}