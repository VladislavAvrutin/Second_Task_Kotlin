package com.example.second_task_kotlin.ui.schedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.second_task_kotlin.R

class SelectTimeAdapter: RecyclerView.Adapter<SelectTimeAdapter.vhSelectTime>() {

    private lateinit var selectTimeList: ArrayList<SelectTime>
    fun updateSelectTime(list: ArrayList<SelectTime>) {
        selectTimeList = list
    }

    class vhSelectTime(var item: View): RecyclerView.ViewHolder(item){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vhSelectTime {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.schedule_item, parent, false)
        return vhSelectTime(view)
    }

    override fun onBindViewHolder(holder: vhSelectTime, position: Int) {
        holder.item.findViewById<ImageView>(R.id.tvSchedule).setImageResource(selectTimeList[position].time)
    }

    override fun getItemCount(): Int {
        return selectTimeList.size
    }
}