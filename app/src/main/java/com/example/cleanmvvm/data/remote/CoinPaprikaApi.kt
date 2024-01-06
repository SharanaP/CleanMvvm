package com.example.cleanmvvm.data.remote

import com.example.cleanmvvm.data.remote.dto.CoinDetailDto
import com.example.cleanmvvm.data.remote.dto.CoinDto
import com.example.cleanmvvm.domian.model.CoinDetail
import retrofit2.http.GET
import retrofit2.http.Path
import java.security.cert.CertPath

interface CoinPaprikaApi {
    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto

}