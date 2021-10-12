package com.example.mychannels.Repository

import android.util.Log
import com.example.mychannels.Model.Channels
import com.example.mychannels.Network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ChannelRepository @Inject
    constructor(private val apiService: ApiService) {
        fun getChannelResponse() = flow<Channels> {
            flow {
                val response = apiService.getProgramChannel()
                emit(response)
            }.flowOn(Dispatchers.IO)
        }

    fun getRecordingResponse() = flow {
        flow<Channels> {
            val response = apiService.bookRecording()
            emit(response)
        }.flowOn(Dispatchers.IO)
    }

    fun getCancelResponse() = flow {
        flow<Channels> {
            val response = apiService.cancelResponse()
            emit(response)
        }.flowOn(Dispatchers.IO)
    }

}