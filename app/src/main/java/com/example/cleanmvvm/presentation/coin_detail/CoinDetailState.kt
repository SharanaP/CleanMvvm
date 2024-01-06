package com.example.cleanmvvm.presentation.coin_detail

import com.example.cleanmvvm.domian.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
