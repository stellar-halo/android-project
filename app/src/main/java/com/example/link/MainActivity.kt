package com.example.link

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.link.databinding.ActivityMainBinding
import com.example.link.databinding.ItemListBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(){
            val intent = Intent(this, Btn1Activity::class.java)
            startActivity(intent)
        }
        binding.btn2.setOnClickListener(){
            val intent = Intent(this, Btn2Activity::class.java)
            startActivity(intent)
        }
    }
}

class MyViewHolder(private val binding:ItemListBinding): RecyclerView.ViewHolder(binding.root)