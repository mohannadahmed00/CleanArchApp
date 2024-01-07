package com.giraffe.sonnaapp.di

import com.giraffe.domain.repository.Repository
import com.giraffe.domain.usecase.GetCategoriesUseCase
import com.giraffe.domain.usecase.InsertCategoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetCategoriesUseCase(repository: Repository): GetCategoriesUseCase {
        return GetCategoriesUseCase(repository)
    }

    @Provides
    fun provideInsertCategoryUseCase(repository: Repository): InsertCategoryUseCase {
        return InsertCategoryUseCase(repository)
    }
}
