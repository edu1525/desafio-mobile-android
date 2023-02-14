package com.example.test.di

import com.example.test.data.datasources.network.MarvelApi
import com.example.test.data.repositories.HeroesRepositoryImpl
import com.example.test.domain.repositories.HeroesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun providesHeroesRepository(api: MarvelApi): HeroesRepository = HeroesRepositoryImpl(api)

}