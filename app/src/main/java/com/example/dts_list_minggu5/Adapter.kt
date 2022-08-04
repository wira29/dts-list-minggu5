package com.example.dts_list_minggu5

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class Adapter(private val dataset: Array<Array<String>>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    private lateinit var parentContext : Context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title : TextView
        var desc : TextView
        var card : MaterialCardView

        init {
            desc = view.findViewById(R.id.txt_desc)
            title = view.findViewById(R.id.txt_title)
            card = view.findViewById(R.id.card_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        parentContext = parent.context
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = dataset[position][0]
        holder.desc.text = dataset[position][1]

        holder.card.setOnClickListener { v ->
            val intent = Intent(parentContext, DetailActivity::class.java)
            intent.putExtra("detail", dataset[position])
            startActivity(parentContext,intent, null)
        }
    }

    override fun getItemCount() = dataset.size
}