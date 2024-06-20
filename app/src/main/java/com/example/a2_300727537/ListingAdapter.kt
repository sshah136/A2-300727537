package com.example.a2_300727537

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.a2_300727537.model.Listing

class ListingAdapter(private val listings: ArrayList<Listing>) : RecyclerView.Adapter<ListingAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = listings[position].title

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listing_row, parent, false)
        return ViewHolder(view)
    }



    override fun getItemCount() = listings.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imgPhoto)
        val title: TextView = itemView.findViewById(R.id.tvTitle)

    }
}