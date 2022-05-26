package com.example.second_task_kotlin.ui.schedule

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.second_task_kotlin.R
import com.example.second_task_kotlin.databinding.FragmentScheduleBinding


class ScheduleFragment : Fragment(R.layout.fragment_schedule) {

    private lateinit var binding: FragmentScheduleBinding
    private var adapter = SelectTimeAdapter()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentScheduleBinding.bind(view)
        adapter.updateSelectTime(SelectTimeData)
//        init()

    }

//    private fun init() {
//        binding.apply {
//            rvSchedule.layoutManager = GridLayoutManager(context, 3)
//            rvSchedule.adapter = adapter }
//    }




}