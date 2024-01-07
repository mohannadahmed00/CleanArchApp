package com.giraffe.sonnaapp.di

import com.giraffe.data.datasource.local.LocalDataSource
import com.giraffe.data.datasource.remote.ApiServices
import com.giraffe.data.datasource.remote.RemoteDataSource
import com.giraffe.data.repository.RepositoryImp
import com.giraffe.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideRepository(remoteDataSource: RemoteDataSource,localDataSource: LocalDataSource): Repository {
        return RepositoryImp(remoteDataSource,localDataSource)
    }
}
