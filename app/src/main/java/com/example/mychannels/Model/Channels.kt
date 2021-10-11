package com.example.mychannels.Model

data class Channels(
    val id:Int,
    val title :String,
    val startTime:LongIterator,
    val duration: Int,
    val image:String
)
