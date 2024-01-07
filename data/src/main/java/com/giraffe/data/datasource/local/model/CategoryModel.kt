package com.giraffe.data.datasource.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("category")
data class CategoryModel(
    @PrimaryKey
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String
)