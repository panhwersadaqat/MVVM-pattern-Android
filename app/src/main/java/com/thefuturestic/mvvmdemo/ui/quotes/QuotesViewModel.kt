package com.thefuturestic.mvvmdemo.ui.quotes

import androidx.lifecycle.ViewModel
import com.thefuturestic.mvvmdemo.data.Quote
import com.thefuturestic.mvvmdemo.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}