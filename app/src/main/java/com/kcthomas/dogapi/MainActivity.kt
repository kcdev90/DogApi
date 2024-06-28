package com.kcthomas.dogapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.kcthomas.dogapi.ui.theme.DogApiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DogApiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    setContent {
                        DogApiTheme {
                            MainScreen(viewModel = MainViewModel())
                        }
                    }
                }
            }
        }
    }
}
