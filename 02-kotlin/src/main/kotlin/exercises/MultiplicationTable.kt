package exercises

/*
Crea una función llamada `tablaMultiplicar` que reciba un número y genere su tabla de multiplicar
(del 1 al 10) guardándola en un ArrayList. Muestra la tabla formateada.

Ejemplo de entrada/salida:

Introduce un número para ver su tabla de multiplicar: 7
Tabla del 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
 */

fun main(){

    println("Introduce un número para ver su tabla de multiplicar: ")
    val number: Int = readln().toInt()
    tablaDeMultiplicar(number)

}

fun tablaDeMultiplicar(num: Int){
    for (i in 1..10){
        println("$num x $i = ${num*i}")
    }
}