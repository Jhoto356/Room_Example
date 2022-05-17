package com.example.myapplication.show_favorite_quotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.myapplication.create_quote.CreateQuoteActivity
import com.example.myapplication.databinding.ActivityFavQuotesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavQuotesActivity : AppCompatActivity() {

    companion object {
        const val TAG = "FavQuoteActivity"
    }

    private lateinit var binding: ActivityFavQuotesBinding
    private val viewModel: FavQuotesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observers()
        setOnClicks()
    }

    private fun setOnClicks() {
        binding.btnAddQuoteFav.setOnClickListener {
            viewModel.goToCreateQuotes()

        }
    }

    private fun observers() {
        viewModel.createQuote.observe(this) {
            Log.i(TAG, "CreateQuote -> $it")
            startActivity(Intent(this, CreateQuoteActivity::class.java))
        }
    }

}