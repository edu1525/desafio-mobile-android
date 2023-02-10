package com.example.test.data.repositories

import com.example.core.base.BaseResponse
import com.example.test.data.datasources.network.MarvelApi
import com.example.test.data.mappers.DataMapper.map
import com.example.test.domain.models.HeroesData
import com.example.test.domain.repositories.HeroesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class HeroesRepositoryImpl(private val api: MarvelApi) : HeroesRepository {
    override fun getHeroes(offset: Int) = flow {
        api.getCharacters(offset, 10, "").apply {
            data?.run {
                emit(BaseResponse.Success(map()))
            } ?: emit(BaseResponse.Error<HeroesData>(IllegalArgumentException()))
        }
    }.catch { emit(BaseResponse.Error<HeroesData>(it)) }
        .flowOn(Dispatchers.IO)
}