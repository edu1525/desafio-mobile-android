package com.example.test.data.datasources.network

import com.example.test.data.datasources.network.models.MarvelHeroesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi {
    @GET("v1/public/characters")
    suspend fun getCharacters(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int,
        @Query("orderBy") orderBy: String
    ): MarvelHeroesResponse
}