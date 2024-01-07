package com.giraffe.data.datasource.remote

class RemoteDataSourceImp(
    private val apiServices: ApiServices
) : RemoteDataSource {
    override suspend fun getCategories() = apiServices.getCategories()
}