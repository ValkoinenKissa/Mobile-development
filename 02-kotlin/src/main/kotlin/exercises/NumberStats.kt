package exercises

/*
Crea una función que reciba un ArrayList de números y devuelva tres valores:
la suma total, el promedio y el número mayor. Usa parámetros de retorno múltiples (con Pair o Triple).

Ejemplo de entrada/salida:
Lista de números: [5, 12, 8, 20, 3, 15]
Suma total: 63
Promedio: 10.5
Número mayor: 20
 */

fun main() {
    val numbers = arrayListOf(5, 12, 8, 20, 3, 15)
    val (totalSum, average, maxNumber) = operateArrayList(numbers)
    println("Lista de numeros $numbers")
    println("Suma total: $totalSum")
    println("Promedio: $average")
    println("Numero mayor $maxNumber")
}

fun operateArrayList(numbersList : ArrayList<Int>) : Triple<Int, Float, Int> {
    var totalSum = 0
    val average: Float
    var counter = 0

    for (numbers in numbersList){
        totalSum += numbers
        counter++
    }

    average = totalSum.toFloat() / counter

    val maxNumber: Int = numbersList.max()

    return Triple(totalSum, average, maxNumber)
}