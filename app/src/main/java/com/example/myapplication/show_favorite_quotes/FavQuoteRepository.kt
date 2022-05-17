package com.example.myapplication.show_favorite_quotes

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FavQuotesRepository @Inject constructor(){

    fun goToCreateQuote(): FavQuoteResponse {
        return FavQuoteResponse.InitCreateQuote(true)
    }

}