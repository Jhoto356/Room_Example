package com.example.myapplication.show_quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myapplication.databinding.ActivityQuoteBinding
import dagger.hilt.EntryPoint

@EntryPoint
class QuoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuoteBinding
    private val viewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}