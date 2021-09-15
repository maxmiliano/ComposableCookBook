package com.raywenderlich.android.composableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.*
import androidx.compose.material.Text

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
    setContent {
      Text("Hello, World!")
    }
  }
}
