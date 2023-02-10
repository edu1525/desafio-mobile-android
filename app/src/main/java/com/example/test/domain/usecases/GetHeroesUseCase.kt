package com.example.test.domain.usecases

import com.example.core.base.BaseResponse
import com.example.core.base.UseCaseWithParams
import com.example.test.domain.models.HeroesData
import com.example.test.domain.repositories.HeroesRepository
import com.example.test.domain.usecases.params.GetHeroesParams
import kotlinx.coroutines.flow.Flow

class GetHeroesUseCase(
    private val repository: HeroesRepository
) : UseCaseWithParams<GetHeroesParams, Flow<BaseResponse<HeroesData>>>() {
    override fun performAction(requestData: GetHeroesParams): Flow<BaseResponse<HeroesData>> {
        return repository.getHeroes(requestData.offset)
    }
}