package com.giraffe.presentation.screens.categories

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.giraffe.domain.entity.CategoriesEntity
import com.giraffe.domain.entity.CategoryEntity

@Composable
fun CategoriesContent(
    mViewModel: CategoriesViewModel = hiltViewModel()
) {
    val state by mViewModel.categories.collectAsState()
    CategoriesScreen(state,mViewModel::insertCategory)

}

@Composable
fun CategoriesScreen(
    state: CategoriesEntity?,
    onClick: (CategoryEntity?) -> Unit
) {
    LazyColumn {
        items(state?.categories?.size ?: 0) {
            Text(state?.categories?.get(it)?.strCategory ?: "null", modifier = Modifier.clickable {
                onClick(state?.categories?.get(it))
            })
        }
    }

}