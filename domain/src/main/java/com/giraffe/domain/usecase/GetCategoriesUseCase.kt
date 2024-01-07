package com.giraffe.domain.usecase

import com.giraffe.domain.repository.Repository

class GetCategoriesUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke() = repository.getCategories()
}