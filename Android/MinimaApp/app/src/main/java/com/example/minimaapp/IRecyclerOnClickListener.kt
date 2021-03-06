package com.example.minimaapp

import android.widget.ImageView
import javax.inject.Inject

interface IRecyclerOnClickListener {

    fun onClickListener(position: Int,url: String,title: String,author: String,detailUrl: String,view: ImageView)
    fun onDeleteListener(position: Int){}
}