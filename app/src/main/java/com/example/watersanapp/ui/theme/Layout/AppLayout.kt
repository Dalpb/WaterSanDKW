package com.example.watersanapp.ui.theme.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.watersanapp.ui.theme.Blue20
import com.example.watersanapp.ui.theme.BlueLigth1
import com.example.watersanapp.ui.theme.BlueMedium
import com.example.watersanapp.ui.theme.BlueStrong
import com.example.watersanapp.ui.theme.HomenajeFont
import com.example.watersanapp.ui.theme.White10

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppLayout(title: String,
    navController: NavController,content: @Composable ()-> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colorStops = arrayOf(
                        0f to BlueStrong,
                        .5f to BlueMedium,
                        1f to BlueLigth1
                    )
                )
            )
    ) {
        Scaffold(
            containerColor = Color.Transparent,
            topBar = {
                TopAppBar(
                    title = {
                        Row(horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxSize()) {
                            Text(title,
                                color = Color.White,
                                fontFamily = HomenajeFont,
                                fontWeight = FontWeight.Medium,
                                fontSize = 45.sp,
                                textAlign = TextAlign.Center) }},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Transparent
                    )
                )
            },
            bottomBar = {
                BottomAppBar(containerColor = Color.White.copy(alpha = 0.5f),
                    modifier = Modifier.fillMaxWidth().height(100.dp)){
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly) {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Home, contentDescription = "Home Icon"
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Info, contentDescription = "Information Icon")
                    }
                    }
                }
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                content()
            }
        }
    }
}