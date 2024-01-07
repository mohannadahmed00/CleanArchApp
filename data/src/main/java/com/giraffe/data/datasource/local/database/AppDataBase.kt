package com.giraffe.data.datasource.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.giraffe.data.datasource.local.model.CategoryModel

@Database(entities = [CategoryModel::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun getCategoriesDao(): CategoriesDao
}
