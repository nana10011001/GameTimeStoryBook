package com.example.gametimestorybook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.uikit.theme.AppTheme
import android.util.Log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("StoryBookTest", "Запуск MainActivity")
        enableEdgeToEdge()
        setContent {
            AppTheme {
                showStorybook()
            }
        }
    }
}