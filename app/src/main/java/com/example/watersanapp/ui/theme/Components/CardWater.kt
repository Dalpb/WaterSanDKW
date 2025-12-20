package com.example.watersanapp.ui.theme.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
@Composable
fun CardWater(cupType: String, quantity: Float, onClick: (quantity: Float) -> Unit, icon: @Composable () -> Unit) {
    val roundCor = 12

    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(color = Color.White, shape = RoundedCornerShape(roundCor.dp))
            .border(2.dp, color = Color(0xFFDBEAFE), shape = RoundedCornerShape(roundCor.dp))
            .clickable { onClick(quantity) }
            .padding(16.dp)
            .width(100.dp)
            ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        icon()
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = cupType,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "$quantity ml",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
    }
}