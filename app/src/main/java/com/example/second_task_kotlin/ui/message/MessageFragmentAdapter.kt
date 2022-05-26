package com.example.second_task_kotlin.ui.message

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.second_task_kotlin.R
import java.util.ArrayList

class MessageFragmentAdapter : RecyclerView.Adapter<MessageFragmentAdapter.mesHolder>() {

    private lateinit var mesDataList : ArrayList<MessageData>
    fun uptadeMesdata(list: ArrayList<MessageData>){
        mesDataList = list
    }


    class mesHolder(var item : View): RecyclerView.ViewHolder(item) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mesHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.message_item, parent,false)
        return mesHolder(view)

    }

    override fun onBindViewHolder(holder: mesHolder, position: Int) {
        holder.item.findViewById<ImageView>(R.id.mesAvatar).setImageResource(mesDataList[position].avatar)
        holder.item.findViewById<TextView>(R.id.mesName).text = mesDataList[position].name
        holder.item.findViewById<TextView>(R.id.mesText).text = mesDataList[position].textMessage
        holder.item.findViewById<TextView>(R.id.mesTime).text = mesDataList[position].time
        holder.item.findViewById<TextView>(R.id.mesNumberCommits).text = mesDataList[position].numberMes
    }

    override fun getItemCount(): Int {
        return mesDataList.size
    }
}