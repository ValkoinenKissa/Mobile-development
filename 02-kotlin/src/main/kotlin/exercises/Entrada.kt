package exercises// public static void exercises.exercises.exercises.main (String[] args){}
// fun nombre(argumentos):retorno{cuerpo}

fun main() {

    println("Primer programa en Kotlin")
    // complejos: Int, Double, Float, Boolean, Char, Byte
    // tipoMod nombre:Tipo = valor
    println("Por favor introduce tu nombre")
    val nombre = readln()
    println("Por favor introduce la edad")
    val edad = readln().toInt()
    println(nombre)
    val dni = "123123123A"
    println("Introduce el correo")
    val correoE: String? = readlnOrNull()
    // mi nombre es Borja, tengo 12 años y mi dni es 123123
    println("Mi nombre es $nombre y tengo $edad años y mi dni es $dni")
    println("Mi correo es: ${correoE?.length ?: "sin definir"}")
    // paramatros posicionales
    // parametros nominales
    // exercises.saludar()
    // exercises.sumar(5, 8)
    alumnos()
    saludar()
    sumar(5, 5)
}

fun alumnos() {
    val listaAlumnos: ArrayList<String> =
        arrayListOf("Juan", "Mariaa", "Marta", "Carlos", "Borjaa")
    // alumno in 0..4
    for (alumno in listaAlumnos) {
        println(alumno)
    }
    listaAlumnos.forEach { println(it) }

    listaAlumnos.forEachIndexed { index, item ->
        if (index % 2 != 0) {
            println("El elemento en posicion $index es $item")
        }
    }
    println(listaAlumnos.find { it.equals("Mateo", true) } ?: "No encontrado")

    val listaFiltrada = listaAlumnos.filter { it.length > 8 }
    if (listaFiltrada.isEmpty()) {
        println("Nadie cummple la condicion de busqueda ")
    } else {
        listaFiltrada.forEach { println(it) }
    }

}

fun saludar(nombre: String = "Maria", veces: Int = 8) {
    // for(int i=0;i<veces;i++){}
    for (item in 0..<veces) {
        println("Hola $nombre, te voy a exercises.saludar, $item veces")
    }
}

val sumar = { op1: Int, op2: Int -> println("El resultado de la suma es ${op1 + op2}") }