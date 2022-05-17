package com.example.myapplication.show_favorite_quotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavQuotesViewModel @Inject constructor(private val repository: FavQuotesRepository): ViewModel() {

    val createQuote: LiveData<Boolean> get() = _createQuote
    private val _createQuote = MutableLiveData<Boolean>()

    fun goToCreateQuotes() {
        when (val response = repository.goToCreateQuote()) {
            is FavQuoteResponse.InitCreateQuote -> _createQuote.postValue(response.allow)
        }
    }

}