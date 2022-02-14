package com.example.link

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.link.databinding.ActivityBtn1Binding
import com.example.link.databinding.ActivityBtn2Binding

class Btn2Activity : AppCompatActivity() {
    lateinit var binding: ActivityBtn2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBtn2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener(){
            finish()
        }
    }
}