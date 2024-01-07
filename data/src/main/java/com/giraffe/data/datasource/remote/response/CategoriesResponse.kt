package com.giraffe.data.datasource.remote.response


data class CategoriesResponse(
    val categories: List<CategoryResponse>
)

data class CategoryResponse(
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)