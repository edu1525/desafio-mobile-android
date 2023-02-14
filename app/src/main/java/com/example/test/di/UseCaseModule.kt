package com.example.test.di

import com.example.test.domain.repositories.HeroesRepository
import com.example.test.domain.usecases.GetHeroesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun providesGetHeroesUseCase(repository: HeroesRepository): GetHeroesUseCase =
        GetHeroesUseCase(repository)
}