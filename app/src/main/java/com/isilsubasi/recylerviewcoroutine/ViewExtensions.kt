package com.isilsubasi.recylerviewcoroutine

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.resimCek(url: String){

        Glide.with(this.context)
            .load(url)
            .into(this)
 }

fun View.kaybet(){

    this.visibility=View.GONE

}

fun View.goster(){

    this.visibility=View.VISIBLE

}