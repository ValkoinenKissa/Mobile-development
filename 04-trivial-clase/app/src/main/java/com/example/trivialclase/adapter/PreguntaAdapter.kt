package com.example.trivialclase.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trivialclase.R
import com.example.trivialclase.databinding.ItemRecyclerPreguntaBinding
import com.example.trivialclase.model.Pregunta
import com.google.android.material.snackbar.Snackbar

//Crear la clase extendiendo de RecyclerView.Adapter
class PreguntaAdapter(var lista: ArrayList<Pregunta>, var contexto: Context) :
    RecyclerView.Adapter<PreguntaAdapter.MyHolder>() {
    //Crear una inner class extendiendo de RecyclerView.ViewHolder
    class MyHolder(var binding: ItemRecyclerPreguntaBinding) :
        RecyclerView.ViewHolder(binding.root)


    //crea el holder (patron de las filas), utilizando la inner class que a su vez utiliza el xml creado
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        val binding: ItemRecyclerPreguntaBinding = ItemRecyclerPreguntaBinding.inflate(
            LayoutInflater.from(contexto), parent, false
        )

        return MyHolder(binding)
    }

    //buscar en la posicion de la lista mostrando en el holder lo que hay en esa posicion -> pinta cada fila

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val item: Pregunta = lista[position]
        holder.binding.nombreRecycler.text = item.question
        Glide.with(contexto).load(item.image)
            .placeholder(R.drawable.ic_launcher_background).into(holder.binding.imagenRecycler)
        holder.binding.botonRecycler.setOnClickListener {
            Snackbar.make(
                holder.binding.root,
                "La respuesta es:",
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }


    //Numero de elementos que hay en la lista -> cuantas filas se pintan
    override fun getItemCount(): Int {
        return lista.size
    }


}