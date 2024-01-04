package com.example.cleanmvvm.data.remote.dto

import com.example.cleanmvvm.domian.model.CoinList

data class CoinListDto(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinListDto.toCoinList: CoinList() 

)