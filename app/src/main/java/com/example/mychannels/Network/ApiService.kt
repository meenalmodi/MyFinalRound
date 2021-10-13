package com.example.mychannels.Network

import com.example.mychannels.Model.BookRecording
import com.example.mychannels.Model.CancelResponse
import com.example.mychannels.Model.Channels
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @GET("programs")
    suspend fun getProgramChannel(@Query("channel_number")channel_number:Int): List<Channels>

    @DELETE("recording")
    suspend fun cancelResponse(
        @Query("channel_number")channel_number:Int,
        @Query("program_id") program_id :Int
    ): List<CancelResponse>

    @POST("recording?recording_id=3456")
    suspend fun bookRecording(@Query("recording_id")recording_id:Int): List<BookRecording>
}