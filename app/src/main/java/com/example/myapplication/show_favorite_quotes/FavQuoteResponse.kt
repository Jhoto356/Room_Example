package com.example.myapplication.show_favorite_quotes

sealed class FavQuoteResponse {

    data class InitCreateQuote(val allow: Boolean): FavQuoteResponse()

}