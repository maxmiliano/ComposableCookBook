package com.raywenderlich.android.composableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      InitialContent()
    }
  }

  @Composable
  @Preview
  private fun InitialContent() {
    Column(modifier = Modifier.fillMaxSize()) {
      TopAppBar(title = {
        Text(text = "ComposableCookBook")
      })
      RecipeList(recipes = defaultRecipes)
    }
  }

}
