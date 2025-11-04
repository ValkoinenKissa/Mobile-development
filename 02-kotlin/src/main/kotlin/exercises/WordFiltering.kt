package exercises

/*
Declara un ArrayList con varias palabras. Pide al usuario que introduzca un número N y filtra las palabras que tengan
 más de N caracteres. Muestra el resultado ordenado alfabéticamente.
 */

fun main(){
    val wordList = arrayListOf("casa", "ordenador", "sol", "programación", "luz", "tecnología")

    print("Introduce el número mínimo de caracteres: ")
    val characterNumber: Int = readln().toInt()
    sortArray(wordList, characterNumber)

}

fun sortArray(wordList: ArrayList<String>, characters: Int){
    val sortedList = wordList.filter {it.length > characters }.sorted()
    println("Palabras con más de 5 caracteres (ordenadas): $sortedList")
}