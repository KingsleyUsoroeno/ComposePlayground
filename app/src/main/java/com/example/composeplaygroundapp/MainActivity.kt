package com.example.composeplaygroundapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.composeplaygroundapp.data.model.recipes
import com.example.composeplaygroundapp.ui.components.RecipeList
import com.example.composeplaygroundapp.ui.theme.ComposePlaygroundAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        TopAppBar(title = {
                            Text("ComposableCookBook",
                            style = TextStyle(color = Color.Black))
                        }, backgroundColor = Color.White)

                        RecipeList(recipes)
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting() {
        Surface(color = Color.Yellow) {
            val defaultTextStyle = TextStyle(
                color = Color.Black,
                fontSize = TextUnit.Unspecified,
                fontWeight = FontWeight.Bold
            )
            Column {
                CustomText(title = "Hello, World!", textStyle = defaultTextStyle)
                CustomText(
                    title = "Hello, Second World!",
                    textStyle = defaultTextStyle.copy(Color.Red)
                )
                CustomText(
                    title = "Hello, Third World!",
                    textStyle = defaultTextStyle.copy(Color.Magenta)
                )
            }
        }
    }

    @Composable
    fun CustomText(title: String, textStyle: TextStyle) {
        Text(
            title,
            style = textStyle
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposePlaygroundAppTheme {
            Greeting()
        }
    }

}