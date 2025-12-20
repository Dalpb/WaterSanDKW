package com.example.watersanapp.View

import android.widget.GridView
import android.widget.ProgressBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.watersanapp.ui.theme.Components.CardWater
import com.example.watersanapp.ui.theme.Components.MyProgressCircle
import com.example.watersanapp.ui.theme.Layout.AppLayout
import com.example.watersanapp.ui.theme.Model.WaterOption
import com.example.watersanapp.ui.theme.ViewModel.HomeViewModel

@Composable
fun HomeView(navController: NavController, viewModel: HomeViewModel) {

    var current = viewModel.currentProgress
    val goal = viewModel.goal

    val waterOptions = listOf(
        WaterOption("Vaso", 250f),
        WaterOption("Taza", 350f),
        WaterOption("Botella", 625f),
        WaterOption("Litro", 1000f)
    )

    AppLayout("Tu Progreso del Día",navController) {
        Spacer(modifier = Modifier.height(5.dp))
        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                    .background(color = Color.White, shape = RoundedCornerShape(
                        20.dp))
                    .padding(20.dp, 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MyProgressCircle(goal, current)
            }
            Column(modifier = Modifier
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                .background(color = Color.White, shape = RoundedCornerShape(
                    20.dp))
                .padding(5.dp, 5.dp)) {

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(waterOptions) { item ->
                        CardWater(
                            cupType = item.name,
                            quantity = item.amount,
                            onClick = viewModel::addProgress
                        ) { }
                    }
                }

            }
        }
    }
}