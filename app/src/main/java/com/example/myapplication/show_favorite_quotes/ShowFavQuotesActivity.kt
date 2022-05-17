package com.example.myapplication.show_favorite_quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityShowFavoritesBooksBinding

class ShowFavoritesBooks : AppCompatActivity() {

    private lateinit var binding: ActivityShowFavoritesBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowFavoritesBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observers()
    }

    private fun observers() {

    }

}