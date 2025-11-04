package exercises

/*
Declara un ArrayList con nombres de ciudades.
Pide al usuario que introduzca una ciudad y verifica si existe en la lista usando
`contains`. Muestra un mensaje apropiado.

Ejemplo de entrada/salida:
Ciudades disponibles: [Madrid, Barcelona, Valencia, Sevilla, Bilbao]
Introduce una ciudad para buscar: Barcelona
✓ La ciudad Barcelona está en la lista
 */

fun main(){
    val cityNames = arrayListOf("Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao")
    print("Introduce una ciudad para buscar: ")
    val searchedCity = readln().uppercase()
    if (cityNames.map { it.uppercase() }.contains(searchedCity))
        println("✓ La ciudad $searchedCity está en la lista")
    else
        println("La ciudad introducida $searchedCity no se encuentra en la lista")
}