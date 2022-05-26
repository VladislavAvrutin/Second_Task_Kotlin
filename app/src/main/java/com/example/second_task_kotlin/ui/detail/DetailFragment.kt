package com.example.second_task_kotlin.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.second_task_kotlin.R
import com.example.second_task_kotlin.databinding.FragmentDetailBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class DetailFragment : Fragment(R.layout.fragment_detail) {
    private lateinit var binding: FragmentDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         binding = FragmentDetailBinding.bind(view)


        val btnShowBottomSheet = view.findViewById<Button>(R.id.detailButton)
        val viewToThird: View = layoutInflater.inflate(R.layout.fragment_schedule, null)
        val dialog = BottomSheetDialog(this.requireActivity())
        dialog.setContentView(viewToThird)

        btnShowBottomSheet.setOnClickListener {
            dialog.show()
        }
    }




}