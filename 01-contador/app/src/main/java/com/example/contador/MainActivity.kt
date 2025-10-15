package com.example.contador
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Esto PRIMERO

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
}