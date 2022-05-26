package com.example.second_task_kotlin.ui.message

import com.example.second_task_kotlin.R

data class MessageData(
    val avatar : Int,
    val name : String,
    val textMessage : String,
    val time : String,
    val numberMes : String
)
var messageData = arrayListOf(
    MessageData(
        avatar = R.drawable.avatar_message,
        name = "Roger Hulg",
        textMessage = "In this course I\\'ll show the step by step, day by day process to build better products, just as Google, Slack, KLM and manu other do.",
        time = "15 min" ,
        numberMes = "3"
    ),
    MessageData(
        avatar = R.drawable.avatar_message,
        name = "Roger Hulg",
        textMessage = "In this course I\\'ll show the step by step, day by day process to build better products, just as Google, Slack, KLM and manu other do.",
        time = "4 min" ,
        numberMes = "3"
    ),
    MessageData(
        avatar = R.drawable.avatar_message,
        name = "Roger Hulg",
        textMessage = "In this course I\\'ll show the step by step, day by day process to build better products, just as Google, Slack, KLM and manu other do.",
        time = "Yestarday" ,
        numberMes = "3"
    ),MessageData(
        avatar = R.drawable.avatar_message,
        name = "Roger Hulg",
        textMessage = "In this course I\\'ll show the step by step, day by day process to build better products, just as Google, Slack, KLM and manu other do.",
        time = "15 min" ,
        numberMes = "3"
    ),
    MessageData(
        avatar = R.drawable.avatar_message,
        name = "Roger Hulg",
        textMessage = "In this course I\\'ll show the step by step, day by day process to build better products, just as Google, Slack, KLM and manu other do.",
        time = "15 min" ,
        numberMes = "3"
    ),
    MessageData(
        avatar = R.drawable.avatar_message,
        name = "Roger Hulg",
        textMessage = "In this course I\\'ll show the step by step, day by day process to build better products, just as Google, Slack, KLM and manu other do.",
        time = "15 min" ,
        numberMes = "3"
    )
)


