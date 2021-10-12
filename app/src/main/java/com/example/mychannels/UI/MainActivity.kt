package com.example.mychannels.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.mychannels.Adapter.ChannelAdapter
import com.example.mychannels.R
import com.example.mychannels.ViewModel.ChannelViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var channelViewModel: ChannelViewModel
    lateinit var adapter: ChannelAdapter
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