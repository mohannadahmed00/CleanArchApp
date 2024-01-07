package com.giraffe.domain.repository

import com.giraffe.domain.entity.CategoriesEntity
import com.giraffe.domain.entity.CategoryEntity

interface Repository {
    suspend fun getCategories(): CategoriesEntity
    suspend fun insertCategory(categoryEntity: CategoryEntity): Long
}