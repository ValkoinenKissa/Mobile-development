package exercises

/*
Crea dos funciones: `celsiusAFahrenheit` y `fahrenheitACelsius`.
Pide al usuario que introduzca una temperatura y la unidad, y muestra la conversión correspondiente.

Ejemplo de entrada/salida:

Introduce la temperatura: 25
Introduce la unidad (C/F): C
25°C = 77.0°F

 */

fun main() {
    println("Introduce la temperatura: ")
    val temp: Int = readln().toInt()
    println("Introduce la unidad (C/F): ")
    val tempUnit: String = readln()

    val result: String = when {
        tempUnit.equals("C", true) -> celsiusAFahrenheit(temp)
        tempUnit.equals("F", true) -> fahrenheitACelsius(temp)


        else -> {
            "La opcion introducida no es correcta"
        }
    }

    println(result)
}

fun celsiusAFahrenheit(temp: Int): String {
    val result: Float = (temp * 9 / 5) + 32.toFloat()
    return "$temp°C = $result°F"

}

fun fahrenheitACelsius(temp: Int): String {
    val result: Float = (temp - 32) * 5 / 9.toFloat()
    return "$temp°F = $result°C"

}