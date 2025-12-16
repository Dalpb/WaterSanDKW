package com.example.watersanapp.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.watersanapp.ui.theme.Blue20
import com.example.watersanapp.ui.theme.Components.PrimaryButton
import com.example.watersanapp.ui.theme.White10
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.watersanapp.ui.theme.HomenajeFont

@Composable
fun InitialView(){
    Scaffold(modifier = Modifier
        .fillMaxSize()
        ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize().background(
                brush = Brush.verticalGradient(
                    colorStops = arrayOf(
                        0.11f to Blue20 ,
                        1f to White10
                    )
                )
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround

        ) {

            Text("WATER SAN\n\n APP",
                textAlign = TextAlign.Center,
                color =Color.White,
                fontSize = 45.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = HomenajeFont
                )
            PrimaryButton(onclick = {}) {
                Text("Iniciar", fontSize = 25.sp, fontFamily = HomenajeFont, fontWeight = FontWeight.Medium)
            }
        }

    }
}