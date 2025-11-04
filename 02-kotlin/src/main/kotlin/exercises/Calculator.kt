package exercises/*
Crea una función llamada calculadora que reciba dos números y una operación
(como String: "suma", "resta", "multiplicacion", "division") y devuelva el resultado.
Llama a la función usando parámetros nominales.


Ejemplo de entrada/salida:
Introduce el primer número: 10
Introduce el segundo número: 5
Introduce la operación (suma, resta, multiplicacion, division): multiplicacion
Resultado: 50
     */

fun main() {
    println("Introduce el primer numero: ")
    val num1: Float = readln().toFloat()
    println("Introduce el segundo numero: ")
    val num2: Float = readln().toFloat()
    println("Introduce la operación (suma, resta, multiplicacion, division): ")
    val operacion: String = readln()

    val resultado: String = calculator(num1 = num1, num2 = num2, operacion = operacion)
    println("Resultado $resultado")
}

fun calculator(num1: Float, num2: Float, operacion: String): String {
    val resultado: String = when {
        operacion.equals("suma", true) -> num1 + num2
        operacion.equals("resta", true) -> num1 - num2
        operacion.equals("multiplicacion", true) -> num1 * num2
        operacion.equals("division", true) -> {
            if (num1 > 0) num1 / num2 else "No se puede dividir entre 0!! "
        }

        else -> {
            println("La opcion introducida no es correcta")
        }
    }.toString()

    return resultado
}