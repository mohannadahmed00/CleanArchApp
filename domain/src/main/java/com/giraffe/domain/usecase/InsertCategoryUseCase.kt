package com.giraffe.domain.usecase

import com.giraffe.domain.entity.CategoryEntity
import com.giraffe.domain.repository.Repository

class InsertCategoryUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(categoryEntity: CategoryEntity) = repository.insertCategory(categoryEntity)
}