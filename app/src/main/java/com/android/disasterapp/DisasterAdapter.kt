package com.android.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.disasterapp.databinding.ItemDisasterBinding
//import com.example.disasterapp.databinding.ItemDisasterBinding

class DisasterAdapter : RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemDisasterViewHolder {
            val binding = ItemDisasterBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false
            )
        return ItemDisasterViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemDisasterViewHolder,
        position: Int
    ) {
        // Mengatur data untuk setiap item
    }

    override fun getItemCount(): Int {
        return 5
    }

    inner class ItemDisasterViewHolder(private val binding: ItemDisasterBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}