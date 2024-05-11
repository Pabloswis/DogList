package com.datamatrix.doglist

import android.media.Image
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.datamatrix.doglist.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bin(image: String){
        Picasso.get().load(image).into(binding.ivDog)

    }
}