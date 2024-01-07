package com.giraffe.data.repository

import com.giraffe.data.datasource.local.LocalDataSource
import com.giraffe.data.datasource.remote.RemoteDataSource
import com.giraffe.data.repository.mapper.toEntity
import com.giraffe.data.repository.mapper.toModel
import com.giraffe.domain.entity.CategoryEntity
import com.giraffe.domain.repository.Repository

class RepositoryImp(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : Repository {
    override suspend fun getCategories() = remoteDataSource.getCategories().toEntity()
    override suspend fun insertCategory(categoryEntity: CategoryEntity)= localDataSource.insertCategory(categoryEntity.toModel())
}