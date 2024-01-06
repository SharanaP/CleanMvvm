package com.example.cleanmvvm.data.repository

import com.example.cleanmvvm.data.remote.CoinPaprikaApi
import com.example.cleanmvvm.data.remote.dto.CoinDetailDto
import com.example.cleanmvvm.data.remote.dto.CoinDto
import com.example.cleanmvvm.domian.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private  val api: CoinPaprikaApi) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}