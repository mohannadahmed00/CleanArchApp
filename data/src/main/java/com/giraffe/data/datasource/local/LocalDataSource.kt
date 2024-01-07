package com.giraffe.data.datasource.local

import com.giraffe.data.datasource.local.model.CategoryModel

interface LocalDataSource {
        suspend fun insertCategory(categoryModel: CategoryModel): Long
}