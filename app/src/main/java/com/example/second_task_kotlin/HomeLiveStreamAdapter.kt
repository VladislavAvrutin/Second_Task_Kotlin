package com.example.second_task_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class HomeLiveStreamAdapter : RecyclerView.Adapter<HomeLiveStreamAdapter.LsHolder>() {
    private lateinit var lsList: ArrayList<LiveStream>

    fun updateData(list: ArrayList<LiveStream>) {
        lsList = list }

    class LsHolder(var item: View) : RecyclerView.ViewHolder(item){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LsHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_live_streaming_recycler_item, parent, false)
        return LsHolder(view)
    }

    override fun onBindViewHolder(holder: LsHolder, position: Int) {
        holder.item.findViewById<ImageView>(R.id.home_rv1_avatar).setImageResource(lsList[position].avatar)
        holder.item.findViewById<ImageView>(R.id.home_rv1_icon).setImageResource(lsList[position].icon)
    }

    override fun getItemCount(): Int {
        return lsList.size
    }



}

