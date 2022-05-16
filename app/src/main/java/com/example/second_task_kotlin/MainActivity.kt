package com.example.second_task_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.second_task_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = LiveStreamAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        adapter.updateData(mockData)
        setContentView(binding.root)
        init()

    }

    private fun init(){
        binding.apply {
            liveStream.layoutManager = LinearLayoutManager(
                applicationContext,
                RecyclerView.HORIZONTAL,
                false
            )
            liveStream.adapter = adapter

        }
    }
}