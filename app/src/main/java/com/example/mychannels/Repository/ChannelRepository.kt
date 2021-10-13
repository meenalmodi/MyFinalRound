package com.example.mychannels.Repository

import com.example.mychannels.Model.BookRecording
import com.example.mychannels.Model.CancelResponse
import com.example.mychannels.Model.Channels
import com.example.mychannels.Network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import javax.inject.Inject


class ChannelRepository @Inject
constructor(private val apiService: ApiService) {

    suspend fun getChannelData(): List<Channels> {
        return apiService.getProgramChannel(3)
    }

    suspend fun getRecordingResponse(): List<BookRecording> {
        return apiService.bookRecording(3456)
    }


    suspend fun getCancelResposnse(): List<CancelResponse> {
        return apiService.cancelResponse(3, 1234)
    }

}








//import com.example.mychannels.Network.ApiService
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.*
//import javax.inject.Inject
//
//class ChannelRepository @Inject
//    constructor(private val apiService: ApiService) {
//    fun getChannelResponse() = flow {
//        val response = apiService.getProgramChannel()
//        emit(response)
//    }.flowOn(Dispatchers.IO)
//
//
//
//    fun getRecordingResponse() = flow {
//            val response = apiService.bookRecording()
//            emit(response)
//        }.flowOn(Dispatchers.IO)
//
//
//    fun getCancelResponse() = flow {
//            val response = apiService.cancelResponse()
//            emit(response)
//        }.flowOn(Dispatchers.IO)
//}