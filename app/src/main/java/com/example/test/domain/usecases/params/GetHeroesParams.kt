package com.example.test.domain.usecases.params

data class GetHeroesParams(
    val offset: Int,
    val limit: Int,
    val orderBy: String
)