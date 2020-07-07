package com.thefuturestic.mvvmdemo.utilities

import com.thefuturestic.mvvmdemo.data.FakeDatabase
import com.thefuturestic.mvvmdemo.data.QuoteRepository
import com.thefuturestic.mvvmdemo.ui.quotes.QuotesViewModelFactory


class InjectorUtils {
    // This will be called from QuotesActivity

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}