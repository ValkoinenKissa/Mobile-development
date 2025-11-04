package exercises

/*
Crea un ArrayList de nombres. Permite al usuario añadir nombres mediante un bucle hasta
que escriba "salir". Después, muestra todos los nombres en mayúsculas usando `map`.

Ejemplo de entrada/salida:

Introduce un nombre (o 'salir' para terminar): Ana
Introduce un nombre (o 'salir' para terminar): Carlos
Introduce un nombre (o 'salir' para terminar): María
Introduce un nombre (o 'salir' para terminar): salir
Nombres en mayúsculas: [ANA, CARLOS, MARÍA]
 */

fun main(){
    val nombres = ArrayList<String>()

    var flag = true

    while (flag){
        print("Introduce un nombre (o 'salir' para terminar): ")
        val nombre: String = readln()
        println()
        if (nombre.equals("salir", true))
            flag = false
        else
            nombres.add(nombre)
    }

    println("Nombres en mayusculas: ${nombres.map { it .uppercase()}}")
}