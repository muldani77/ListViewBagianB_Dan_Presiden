package com.example.listviewb.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewb.R
import com.example.listviewb.model.Bahasaku
import com.example.listviewb.model.DataBahasaku.listBahasaku

class ListBahasakuAdapter (private val context: Context, private val Bahasaku: ArrayList<Bahasaku>, private val listener: (Bahasaku) -> Unit)
    : RecyclerView.Adapter<ListBahasakuAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListBahasakuAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_bahasaku, parent, false))
    }

    override fun getItemCount(): Int {
        return listBahasaku.size
    }

    override fun onBindViewHolder(holder: ListBahasakuAdapter.ViewHolder, position: Int) {
        holder.bindbahasaku(Bahasaku[position],listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindbahasaku(bahasaku: Bahasaku, listener: (Bahasaku) -> Unit){
            tvName.text = bahasaku.name
            tvDetail.text = bahasaku.detail
            Glide.with(itemView.context)
                .load(bahasaku.poster)
                .into(imgPoster)
        }
    }
}