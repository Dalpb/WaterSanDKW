package com.example.watersanapp.View

import android.widget.ProgressBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.watersanapp.ui.theme.Components.MyProgressCircle
import com.example.watersanapp.ui.theme.Layout.AppLayout
import com.example.watersanapp.ui.theme.ViewModel.HomeViewModel

@Composable
fun HomeView(navController: NavController, viewModel: HomeViewModel) {

    AppLayout(navController) {
        Text(text = "Tu Progeso del Día")
        Column(
            modifier = Modifier.background(color = Color.White)
        ) {

            MyProgressCircle(2200, 2200)
        }
    }
}