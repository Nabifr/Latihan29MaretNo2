package com.android.latihan2recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter (var listNews : ArrayList<ListNews>): RecyclerView.Adapter<NewsAdapter.ViewHolder>(){

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var judul = view.findViewById<TextView>(R.id.txtJudul)
        var tanggal = view.findViewById<TextView>(R.id.txtTgl)
        var kategori = view.findViewById<TextView>(R.id.txtKtgri)
        var img = view.findViewById<ImageView>(R.id.imgNews)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.judul.text = listNews[position].judul
        holder.tanggal.text = listNews[position].tanggal.toString()
        holder.kategori.text = listNews[position].kategori
        holder.img.setImageResource(listNews[position].img)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

}