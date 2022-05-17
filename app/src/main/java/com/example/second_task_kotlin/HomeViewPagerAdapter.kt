package com.example.second_task_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeViewPagerAdapter : RecyclerView.Adapter<HomeViewPagerAdapter.PagerVH>() {
    private lateinit var pagerList: ArrayList<HomeViewPager>
    fun updatePager(list : ArrayList<HomeViewPager>){
        pagerList = list
    }


    class PagerVH(var item : View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_pager1, parent, false)
        return PagerVH(view)
    }

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        holder.item.findViewById<ImageView>(R.id.background).setImageResource(pagerList[position].background)
        holder.item.findViewById<TextView>(R.id.btViewPager).text = pagerList[position].button
        holder.item.findViewById<TextView>(R.id.header).text = pagerList[position].header
        holder.item.findViewById<TextView>(R.id.publicationTime).text = pagerList[position].time
        holder.item.findViewById<TextView>(R.id.tvOne).text = pagerList[position].tv1
        holder.item.findViewById<TextView>(R.id.tvTwo).text = pagerList[position].tv2
        holder.item.findViewById<TextView>(R.id.tvThree).text = pagerList[position].tv3
        holder.item.findViewById<ImageView>(R.id.authorAvatar).setImageResource(pagerList[position].avatar)
        holder.item.findViewById<TextView>(R.id.authorName).text = pagerList[position].authorName
        holder.item.findViewById<TextView>(R.id.authorProfession).text = pagerList[position].authorProf
    }

    override fun getItemCount(): Int {
       return pagerList.size
    }

}