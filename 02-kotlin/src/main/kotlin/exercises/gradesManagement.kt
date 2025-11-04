package exercises
/*
Crea un ArrayList de calificaciones (Double). Implementa funciones separadas para: calcular el promedio,
contar cuántas son aprobadas (>=5), y encontrar la calificación más alta.
Usa parámetros nominales al llamar las funciones.

Ejemplo de entrada/salida:

Calificaciones: [7.5, 4.2, 8.9, 5.5, 3.8, 9.1, 6.7]
Promedio: 6.53
Aprobadas: 5
Calificación más alta: 9.1

 */

fun main(){
    val grades = arrayListOf(7.5, 4.2, 8.9, 5.5, 3.8, 9.1, 6.7)
    println("Calificaciones: $grades")
    averageCalc(grades)
    approvedGrades(grades)
    maxCalif(grades)
}


fun averageCalc(grades: ArrayList<Double>){
    var count = 0
    var acum = 0.0
    for (num in grades){
        acum+= num
        count++

    }
    val average = acum / count

    println("Promedio: %.2f".format(average))

}

fun approvedGrades(grades : ArrayList<Double>){
    var approvedCount = 0
    for (num in grades){
        if (num >= 5)
            approvedCount++
    }
    println("Aprovadas: $approvedCount")
}

fun maxCalif(grades : ArrayList<Double>){
    println("Calificacion mas alta: ${grades.max()}")
}