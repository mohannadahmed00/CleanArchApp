package com.giraffe.data.datasource.remote

import com.giraffe.data.datasource.remote.response.CategoriesResponse

interface RemoteDataSource {
    suspend fun getCategories(): CategoriesResponse
}