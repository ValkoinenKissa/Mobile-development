package exercises/*
Declara un ArrayList con 10 números enteros. Utiliza la función filter para crear una nueva lista
que contenga solo los números pares y muéstrala por pantalla.
Ejemplo de entrada/salida:
Lista original: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Números pares: [2, 4, 6, 8, 10]
 */


fun main() {
    val originalList = ArrayList(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    val pares = originalList.filter {it % 2 == 0}

    println("Lista original $originalList")

    println("Numeros pares $pares")

}

