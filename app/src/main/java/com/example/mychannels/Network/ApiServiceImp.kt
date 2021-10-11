package com.example.mychannels.Network

import com.example.mychannels.Model.BookRecording
import com.example.mychannels.Model.CancelResponse
import com.example.mychannels.Model.Channels
import javax.inject.Inject

class ApiServiceImp @Inject constructor(private val apiServiceImp: ApiServiceImp) {

     suspend fun getChannelResponse(): Channels = apiServiceImp.getChannelResponse()

     suspend fun cancelResponse(): CancelResponse = apiServiceImp.cancelResponse()

     suspend fun bookRecording(): BookRecording = apiServiceImp.bookRecording()
}