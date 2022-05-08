package com.isilsubasi.recylerviewcoroutine

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isilsubasi.recylerviewcoroutine.databinding.CardviewOgrenciBinding

class OgrenciAdapter(var ogrenciler: ArrayList<String>,
                     var onItemClickListener: ItemClickListener) : RecyclerView.Adapter<OgrenciAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: CardviewOgrenciBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OgrenciAdapter.ViewHolder {
        val binding = CardviewOgrenciBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: OgrenciAdapter.ViewHolder, position: Int) {
        with(holder){

            binding.apply {

                binding.txtIsim .text = ogrenciler[position]

                cardView.setOnClickListener{
                    onItemClickListener.onItemClick(position)
                }

                btnDelete.setOnClickListener {

                    onItemClickListener.onDelete(position)
                }

            }
        }

    }

    override fun getItemCount(): Int {
        return ogrenciler.size

    }
}