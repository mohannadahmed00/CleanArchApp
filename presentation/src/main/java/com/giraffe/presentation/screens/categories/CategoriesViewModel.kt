package com.giraffe.presentation.screens.categories

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.giraffe.domain.entity.CategoriesEntity
import com.giraffe.domain.entity.CategoryEntity
import com.giraffe.domain.usecase.GetCategoriesUseCase
import com.giraffe.domain.usecase.InsertCategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase,
    private val insertCategoryUseCase: InsertCategoryUseCase
) : ViewModel() {
    companion object {
        private const val TAG = "MealsViewModel"
    }

    private val _categories: MutableStateFlow<CategoriesEntity?> = MutableStateFlow(null)
    val categories = _categories.asStateFlow()

    init {
        getMeals()
    }


    private fun getMeals() {
        viewModelScope.launch {
            try {
                _categories.update {
                    getCategoriesUseCase()
                }
            } catch (e: Exception) {
                Log.e(TAG, "getMeals: ${e.message}")
            }
        }
    }

    fun insertCategory(categoryEntity: CategoryEntity?) {
        viewModelScope.launch {
            try {
                if (categoryEntity != null) {
                    insertCategoryUseCase(categoryEntity)
                } else {
                    Log.e(TAG, "getMeals: null")
                }
            } catch (e: Exception) {
                Log.e(TAG, "getMeals: ${e.message}")
            }
        }
    }
}