package com.example.hw_3_6_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_3_6_kotlin.databinding.ItemPersonageBinding


class PersonageAdapter(
    private val context: Context,
    private val name: String,
    private val itemList: List<String>
) : RecyclerView.Adapter<PersonageAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemPersonageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val itemTextView = binding.tvName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemPersonageBinding.inflate(inflater, parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.itemTextView.text = "$name $item"
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
