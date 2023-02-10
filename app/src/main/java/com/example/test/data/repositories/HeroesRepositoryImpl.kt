package com.example.test.data.repositories

import com.example.test.data.datasources.network.MarvelApi
import com.example.test.data.mappers.DataMapper.map
import com.example.test.domain.repositories.HeroesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map

class HeroesRepositoryImpl(private val api: MarvelApi) : HeroesRepository {
    override fun getHeroes() = flow {
        api.getCharacters(0, 10, "").apply { emit(data) }
    }
        .map { it?.map() }
        .flowOn(Dispatchers.IO)
}