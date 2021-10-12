package com.example.mychannels.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mychannels.Model.Channels
import com.example.mychannels.R
import com.example.mychannels.ViewModel.ChannelViewModel

class ChannelAdapter(private val context: Context,private val channels:ArrayList<Channels>)
    :RecyclerView.Adapter<ChannelAdapter.MyChannelViewHolder>() {
    lateinit var channelViewModel:ChannelViewModel
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChannelAdapter.MyChannelViewHolder {
        return  MyChannelViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycleview_channels,parent,false))
    }

    override fun onBindViewHolder(holder: ChannelAdapter.MyChannelViewHolder, position: Int) {
        val post=channels[position]
        holder.Channel_title.text = post.title
        holder.Channel_Duration.text = post.duration.toString()
        holder.Channel_Session.text = post.startTime.toString()
        holder.toggleButton.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{CompoundButton,ischecked->
            if (ischecked){
                channelViewModel.gerRecordingResponse()
                Toast.makeText(context,"The video is recording",Toast.LENGTH_LONG).show()
            } else{
                channelViewModel.getCancelResponse()
                Toast.makeText(context,"The video stop recording",Toast.LENGTH_LONG).show()
            }
        })

    }
    override fun getItemCount(): Int =channels.size

    class MyChannelViewHolder(items:View) :RecyclerView.ViewHolder(items){

        val Channel_title = itemView.txt_Channel_title
        val Channel_Duration = itemView.txt_channel_Duration
        val Channel_Session = itemView.txt_channel_sessions
        var PostImage_view = itemView.txt_image
        val toggleButton= itemView.Recording

    }
}