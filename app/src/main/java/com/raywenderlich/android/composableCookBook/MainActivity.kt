package com.raywenderlich.android.composableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
    setContent {
      Greeting()
    }
  }

  @Composable
  @Preview
  fun Greeting() {
    Column {
      Text("Hello, World!", style = TextStyle(color = Color.Green))
      Text("Hello, Second World!", style = TextStyle(color = Color.Blue))
      Text("Hello, Third World!", style = TextStyle(color = Color.Red))
    }

  }

}
