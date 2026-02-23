package com.example.listactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val data: List<News>) :
    RecyclerView.Adapter<NewsAdapter.VH>() {

    class VH(row: View) : RecyclerView.ViewHolder(row) {
        val sourceText: TextView = row.findViewById(R.id.sourceText)
        val titleText: TextView = row.findViewById(R.id.titleText)
        val descText: TextView = row.findViewById(R.id.descText)
        val timeText: TextView = row.findViewById(R.id.timeText)
        val newsImage: ImageView = row.findViewById(R.id.newsImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = data[position]
        holder.sourceText.text = item.source
        holder.titleText.text = item.title
        holder.descText.text = item.description
        holder.timeText.text = item.time
        holder.newsImage.setImageResource(item.imageResId)
    }

    override fun getItemCount(): Int = data.size
}