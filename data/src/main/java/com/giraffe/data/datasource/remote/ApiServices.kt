package com.giraffe.data.datasource.remote

import com.giraffe.data.datasource.remote.response.CategoriesResponse
import retrofit2.http.GET

interface ApiServices {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}