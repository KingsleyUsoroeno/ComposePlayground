package com.example.composeplaygroundapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeplaygroundapp.data.model.Recipe

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumn {
        items(recipes.size) {
            RecipeCard(recipe = recipes[it], Modifier.padding(16.dp))
        }
    }
}