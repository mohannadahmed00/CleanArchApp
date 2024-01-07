package com.giraffe.data.repository.mapper

import com.giraffe.data.datasource.local.model.CategoryModel
import com.giraffe.data.datasource.remote.response.CategoriesResponse
import com.giraffe.domain.entity.CategoriesEntity
import com.giraffe.domain.entity.CategoryEntity

fun CategoriesResponse.toEntity():CategoriesEntity {
    return CategoriesEntity(this.categories.map {
        CategoryEntity(it.idCategory,it.strCategory,it.strCategoryDescription,it.strCategoryThumb)
    })
}

fun CategoryEntity.toModel():CategoryModel{
    return CategoryModel(this.idCategory,this.strCategory,this.strCategoryThumb)
}