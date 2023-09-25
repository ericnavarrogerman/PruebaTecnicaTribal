package com.example.pruebatecnica.ui

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PalabrasAdapter: RecyclerView.Adapter<PalabrasAdapter.Holder>() {

    var lista :  List<String> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder{

        var textview:TextView = TextView(parent.context)
        return Holder(textview)
    }

    override fun getItemCount()= lista.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
      var textView  =  holder.itemView  as TextView
        textView.text = lista[position]
    }

    inner class Holder(v:View):RecyclerView.ViewHolder(v){

    }

}