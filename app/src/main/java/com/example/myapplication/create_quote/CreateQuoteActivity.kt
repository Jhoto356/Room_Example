package com.example.myapplication.create_quote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCreateQuoteBinding

class CreateQuoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateQuoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}