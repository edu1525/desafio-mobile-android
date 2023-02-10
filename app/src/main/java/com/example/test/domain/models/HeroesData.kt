package com.example.test.domain.models

data class HeroesData(
    val count: Int?,
    val limit: Int?,
    val offset: Int?,
    val heroes: List<Hero>?,
    val total: Int?
)
