package com.example.imdbtop100.di

import com.example.imdbtop100.repository.Top100MoviesRepository
import com.example.imdbtop100.retrofit.RetrofitApiCall
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepositoryObject(retrofitApiCall: RetrofitApiCall): Top100MoviesRepository {
        return Top100MoviesRepository(retrofitApiCall)
    }
}