package com.example.cleanmvvm.presentation.coin_list

import com.example.cleanmvvm.domian.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
