package com.example.second_task_kotlin.ui.message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.second_task_kotlin.R
import com.example.second_task_kotlin.databinding.FragmentMessageBinding
import kotlinx.coroutines.NonDisposableHandle.parent

class MessageFragment : Fragment(R.layout.fragment_message) {
    private lateinit var binding:FragmentMessageBinding

    private val adapter = MessageFragmentAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMessageBinding.bind(view)
        init()
        adapter.uptadeMesdata(messageData)
    }



    private fun init() {
        binding.apply {
            rvMessage.layoutManager = LinearLayoutManager(
                context, RecyclerView.VERTICAL , false
            )
            rvMessage.adapter = adapter
        }
    }


}