package com.example.second_task_kotlin.ui.main

import com.example.second_task_kotlin.R

data class  LiveStream(val avatar: Int, val icon: Int ){

}

val mockData = arrayListOf(
    LiveStream(R.drawable.recycler_ava_1, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_2, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_3, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_3, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_2, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_1, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_3, R.drawable.home_recycler_live_stream_video_icon),
    LiveStream(R.drawable.recycler_ava_3, R.drawable.home_recycler_live_stream_video_icon),
)
