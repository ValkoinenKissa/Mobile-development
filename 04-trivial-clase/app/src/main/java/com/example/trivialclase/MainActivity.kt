package com.example.trivialclase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trivialclase.adapter.PreguntaAdapter
import com.example.trivialclase.databinding.ActivityMainBinding
import com.example.trivialclase.model.Pregunta

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPreguntas: PreguntaAdapter
    private lateinit var lista: ArrayList<Pregunta>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        instancias()
        initGUI()
    }

    private fun initGUI() {
        binding.recyclerPreguntas.adapter = adapterPreguntas
        if (resources.configuration.orientation == 1) {
            binding.recyclerPreguntas.layoutManager = LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
            )
        } else if (resources.configuration.orientation == 2) {

            binding.recyclerPreguntas.layoutManager =
                GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)

        }

    }

    private fun instancias() {

        lista = arrayListOf(
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp"),
            Pregunta("Tecnologia", "Dificil", "Ejemplo", "Que significa USB?", "https://acf.geeknetic.es/imgri/imagenes/auto/24/12/23/qvy-que-es-el-usb-a-y-para-que-sirve.jpg?f=webp")

            )



        adapterPreguntas = PreguntaAdapter(lista, this)
    }

}