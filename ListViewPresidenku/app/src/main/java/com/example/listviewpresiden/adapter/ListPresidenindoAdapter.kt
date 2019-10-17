package com.example.listviewpresiden.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresiden.R
import com.example.listviewpresiden.model.DataPresidenindo.listPresidenindo
import com.example.listviewpresiden.model.Presidenindo
import java.util.*
import kotlin.collections.ArrayList

class ListPresidenindoAdapter (
    private val context: Context, private val presidenindo: ArrayList<Presidenindo>, private val listener: (Presidenindo) -> Unit)
    : RecyclerView.Adapter<ListPresidenindoAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListPresidenindoAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.daftar_presiden, parent, false))
    }

    override fun getItemCount(): Int {
        return listPresidenindo.size
    }

    override fun onBindViewHolder(holder: ListPresidenindoAdapter.ViewHolder, position: Int) {
        holder.bindPresidenindo(presidenindo[position],listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindPresidenindo(presidenindo: Presidenindo, listener: (Presidenindo) -> Unit){
            tvName.text = presidenindo.name
            Glide.with(itemView.context)
                .load(presidenindo.poster)
                .into(imgPoster)

            itemView.setOnClickListener {
                listener(presidenindo)
            }
        }
    }
}