package com.example.test.data.repositories

import com.example.test.data.datasources.network.MarvelApi
import com.example.test.domain.repositories.HeroesRepository
import kotlinx.coroutines.flow.flow

class HeroesRepositoryImpl(private val api: MarvelApi) : HeroesRepository {
    override fun getHeroes() = flow {
        val response = api.getCharacters("", "", "", 0, 10, "")
        emit(response.)
    }
}