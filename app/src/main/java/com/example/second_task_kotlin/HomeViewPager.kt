package com.example.second_task_kotlin

data class HomeViewPager(
    val background : Int,
    val button : String,
    val header : String,
    val time : String,
    val clockIcon : Int,
    val tv1 : String,
    val tv2 : String,
    val tv3 : String,
    val avatar : Int,
    val authorName : String,
    val authorProf : String

)

val pagerData = arrayListOf(
    HomeViewPager(background = R.drawable.base_background,
    button = "Free e-book",
    header = "Text",
    time = "22:24:56",
    clockIcon = R.drawable.stopwatch,
    tv1 = "6 lessons",
    tv2 = "erere",
    tv3 = "ddssdsd",
    avatar = R.drawable.avatar_1,
    authorName = "Brendon Garis",
    authorProf = "programmer"),

    HomeViewPager(background = R.drawable.base_background,
    button = "Free e-book",
    header = "Text",
    time = "22:24:56",
    clockIcon = R.drawable.stopwatch,
    tv1 = "6 lessons",
    tv2 = "erere",
    tv3 = "ddssdsd",
    avatar = R.drawable.avatar_1,
    authorName = "Brendon Garis",
    authorProf = "programmer")
)
