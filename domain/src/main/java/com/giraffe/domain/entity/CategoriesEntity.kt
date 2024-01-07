package com.giraffe.domain.entity
data class CategoriesEntity(
    val categories: List<CategoryEntity>
)
data class CategoryEntity(
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)