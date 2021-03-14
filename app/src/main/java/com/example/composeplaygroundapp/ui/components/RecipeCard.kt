package com.example.composeplaygroundapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeplaygroundapp.data.model.Recipe
import com.example.composeplaygroundapp.data.model.recipes

@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp, modifier = modifier) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painterResource(recipe.imageResource),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = recipe.title, style = MaterialTheme.typography.h4)

                for (ingredient in recipe.ingredients) {
                    Text("* $ingredient")
                }
            }
        }
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(recipes[0], Modifier.padding(16.dp))
}