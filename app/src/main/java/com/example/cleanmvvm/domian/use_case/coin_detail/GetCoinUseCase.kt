package com.example.cleanmvvm.domian.use_case.coin_detail

import android.util.Log
import com.example.cleanmvvm.common.Resource
import com.example.cleanmvvm.data.remote.dto.toCoinDetail
import com.example.cleanmvvm.domian.model.CoinDetail
import com.example.cleanmvvm.domian.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            Log.i("GetCoinUseCase", "coin $coin")
            emit(Resource.Success(coin))
        } catch (e: retrofit2.HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "an unexpected error occurred "))
        } catch (e: IOException) {
            emit((Resource.Error(e.localizedMessage ?: "network issue")))
        }
    }
}