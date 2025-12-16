package com.example.watersanapp.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.watersanapp.ui.theme.Blue20
import com.example.watersanapp.ui.theme.Components.PrimaryButton
import com.example.watersanapp.ui.theme.White10
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.watersanapp.R
import com.example.watersanapp.ui.theme.HomenajeFont
import com.example.watersanapp.ui.theme.Yellow10
@Composable
fun InitialView(){

    val imageLogo = painterResource(R.drawable.tear_logo)

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
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .drawBehind() {
                            drawCircle(
                                color = Yellow10.copy(alpha = 0.3f),
                                radius = size.width / 2 + 10.dp.toPx(),
                                center = center
                            )
                        }
                        .background(color = Yellow10, shape = CircleShape)
                        .clip(CircleShape)
                        .border(3.dp, Color.Transparent, CircleShape)
                ) {
                    Image(
                        painter = imageLogo,
                        contentDescription = "Represent the logo image",
                        modifier = Modifier.fillMaxSize().offset(y = 27.dp)
                    )
                }
                Text(
                    "WATER SAN\n\n APP",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = HomenajeFont
                )
            }
            PrimaryButton(onclick = {}) {
                Text("Iniciar", fontSize = 25.sp, fontFamily = HomenajeFont, fontWeight = FontWeight.Medium)
            }
        }

    }
}