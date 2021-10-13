package com.example.mychannels.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.mychannels.Adapter.ChannelAdapter
import com.example.mychannels.R
import com.example.mychannels.ViewModel.ChannelViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val channelViewModel:ChannelViewModel by viewModels()
    private lateinit var adapter: ChannelAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycleView()
        channelViewModel.getChannel()
    }

    private fun initRecycleView() {

        recyclerView = findViewById(R.id.recycleView)
        adapter= ChannelAdapter(this, ArrayList())
        recyclerView.apply {
            setHasFixedSize(true)
        }

    }
}