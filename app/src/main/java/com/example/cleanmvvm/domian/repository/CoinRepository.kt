package com.example.cleanmvvm.domian.repository

import com.example.cleanmvvm.data.remote.dto.CoinDetailDto
import com.example.cleanmvvm.data.remote.dto.CoinDto
import dagger.hilt.InstallIn

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}