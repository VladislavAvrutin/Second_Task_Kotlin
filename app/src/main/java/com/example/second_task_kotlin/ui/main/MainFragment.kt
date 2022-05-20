package com.example.second_task_kotlin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.second_task_kotlin.R
import com.example.second_task_kotlin.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainFragment : Fragment(R.layout.fragment_main) {


    private lateinit var binding : FragmentMainBinding
   private val adapter = HomeLiveStreamAdapter()
   private val viewPagerAdapter = HomeViewPagerAdapter()




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        adapter.updateData(mockData)
        viewPagerAdapter.updatePager(pagerData)

        init()

        viewPagerInit()
    }



    private fun init(){
        binding.apply {
            liveStream.layoutManager = LinearLayoutManager(
                context,//земена applicationcontext
                RecyclerView.HORIZONTAL,
                false)
            liveStream.adapter = adapter

        }

    }

    private fun viewPagerInit(){
        binding.pager.adapter = viewPagerAdapter
    }
}

