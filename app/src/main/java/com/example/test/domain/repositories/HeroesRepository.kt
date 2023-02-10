package com.example.test.domain.repositories

import com.example.core.base.BaseResponse
import com.example.test.domain.models.HeroesData
import kotlinx.coroutines.flow.Flow

interface HeroesRepository {
    fun getHeroes(offset: Int): Flow<BaseResponse<HeroesData>>
}