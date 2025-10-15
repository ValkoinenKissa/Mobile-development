package com.example.contador

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    var contador = 0

    val tag = "ESTADOS_CONTADOR"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Esto PRIMERO
        Log.d(tag, "En el metodo onCreate")

        // Referencia al TextView
        val textViewContador = findViewById<TextView>(R.id.textViewContador)

        // Inicializamos el TextView con el contador a 0
        textViewContador.text = contador.toString()

        // Referencia al botón
        val btAdd = findViewById<Button>(R.id.btAdd)

        // Asociamos una expresión lambda como respuesta al evento Clic
        btAdd.setOnClickListener {
            contador++
            textViewContador.text = contador.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "En el metodo onStar")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "En el metodo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "En el metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "En el metodo onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "En el metodo onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "En el metodo onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(
            tag, "onSaveInstanceState, guardado contador con valor " +
                    contador.toString()
        )
        outState.putInt("CONTADOR", contador)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contador = savedInstanceState.getInt("CONTADOR")
        Log.d(
            tag, "onSaveInstanceState, restauro el contador con valor " +
                    contador.toString()
        )

        val textViewContador: TextView = findViewById(R.id.textViewContador)
        textViewContador.text = contador.toString()
    }
}