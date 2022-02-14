package com.example.link

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.link.databinding.ActivityBtn1Binding

class Btn1Activity : AppCompatActivity() {
    lateinit var binding: ActivityBtn1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // todo 찾아보기 차이점 list vs MutableList
        val memoList: MutableList<Memo> = mutableListOf()
        val adapter = MemoListAdapter(memoList)

        binding = ActivityBtn1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerList.adapter = adapter

        binding.btnBack.setOnClickListener() {
            finish()
        }
        binding.btnEnter.setOnClickListener() {
            val memoItem: Memo = Memo(
                binding.editTitle.text.toString(),
                binding.editContent.text.toString()
            )
            memoList.add(memoItem)
            // TODO: 2022-02-08  notifyDataSetChanged
            adapter.notifyDataSetChanged()
        }
    }
}