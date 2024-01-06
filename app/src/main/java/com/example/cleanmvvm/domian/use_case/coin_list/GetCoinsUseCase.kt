package com.example.cleanmvvm.domian.use_case.coin_list

import com.example.cleanmvvm.common.Resource
import com.example.cleanmvvm.common.Resource.*
import com.example.cleanmvvm.data.remote.dto.toCoin
import com.example.cleanmvvm.domian.model.Coin
import com.example.cleanmvvm.domian.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Success(coins))
        } catch (e: retrofit2.HttpException) {
            emit(Error(e.localizedMessage ?: "an unexpected error occurred "))
        } catch (e: IOException) {
            emit((Error(e.localizedMessage ?: "network issue")))
        }
    }
}