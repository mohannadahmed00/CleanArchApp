package com.giraffe.data.datasource.local

import com.giraffe.data.datasource.local.database.CategoriesDao
import com.giraffe.data.datasource.local.model.CategoryModel

class LocalDataSourceImp(
    private val categoriesDao: CategoriesDao
) : LocalDataSource {
    override suspend fun insertCategory(categoryModel: CategoryModel) = categoriesDao.insertCategory(categoryModel)
}