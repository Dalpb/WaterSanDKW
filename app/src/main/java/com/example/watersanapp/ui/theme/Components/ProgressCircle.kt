package com.example.watersanapp.ui.theme.Components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.watersanapp.ui.theme.Blue20
import com.example.watersanapp.ui.theme.HomenajeFont

@Composable
fun MyProgressCircle(goal: Float,progress: Float){
    if(goal <= 0)return

    val cSize = 230
    val wBorder : Float = 40f
    val targetAnuim = (progress/goal) //esto esx tomdavia reactivo

    val progressAnimation by animateFloatAsState(
        targetValue = targetAnuim,
        animationSpec = tween(1000),
        label = "ProgressionAnimationCircle"
    )


    var percentage = progressAnimation * 100
    val angle = progressAnimation * 360f


    Box(modifier = Modifier.size(cSize.dp)
        .background(color = Color.Transparent)){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Transparent)
                .drawBehind() {
                    drawArc(
                        startAngle = 0.0f,
                        sweepAngle = 3600.0f,
                        useCenter = false,
                        size = Size(size.width, size.height),
                        style = Stroke(width = wBorder),
                        brush = Brush.verticalGradient(colors = listOf(Color(0xFFDBEAFE),Color(0xFFDBEAFE)))
                    )
                }
                .background(color = Color.Transparent)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawBehind() {
                    drawArc(
                        startAngle = 270.0f,
                        sweepAngle = (angle),
                        useCenter = false,
                        size = Size(size.width, size.height),
                        style = Stroke(width = wBorder),
                        brush = Brush.verticalGradient(colors = listOf(Blue20, Color(0xFF07B3D5)))
                    )
                }
                .background(color = Color.Transparent)
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Transparent),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = "${percentage.toInt()}%", fontSize = 60.sp, fontWeight = FontWeight.SemiBold,
                fontFamily = HomenajeFont
            )
            Text(text = "${progress.toInt()} / ${goal.toInt()} ml", fontSize = 24.sp, fontFamily = HomenajeFont)
        }
    }
}