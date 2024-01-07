package com.giraffe.sonnaapp.di

import android.content.Context
import androidx.room.Room
import com.giraffe.data.datasource.local.LocalDataSource
import com.giraffe.data.datasource.local.LocalDataSourceImp
import com.giraffe.data.datasource.local.database.AppDataBase
import com.giraffe.data.datasource.local.database.CategoriesDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context:Context):AppDataBase{
        return  Room.databaseBuilder(context.applicationContext, AppDataBase::class.java, "sonna_database").build()
    }

    @Provides
    @Singleton
    fun provideCategoriesDao(appDataBase: AppDataBase): CategoriesDao {
        return appDataBase.getCategoriesDao()
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(categoriesDao: CategoriesDao): LocalDataSource {
        return LocalDataSourceImp(categoriesDao)
    }
}