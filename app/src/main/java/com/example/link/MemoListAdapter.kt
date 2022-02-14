package com.example.link

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.link.databinding.ItemListBinding


class MemoListAdapter(private val itemList: List<Memo>) :
    RecyclerView.Adapter<MemoListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.v("viewholder", "onCreateViewHolder ")
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO: 2022-02-08 스크롤하면서 보면 됨 
        Log.v("viewholder", "onBindViewHolder : $position")
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size

    class ViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Memo) {
            Log.v("viewholder", "ViewHolder : ${item.title}, ${item.content}")
            binding.textTitle.text = item.title
            binding.textContent.text = item.content
        }
    }

}