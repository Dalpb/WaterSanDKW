package com.example.watersanapp.ui.theme.Components

import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.watersanapp.R
import kotlinx.coroutines.delay

// in progress, jsut a img for now Dx
@Composable
fun Tamagotchi(){
    val imageW = painterResource( R.drawable.waifu)

    val fullText = "¡Hola! Soy tu Water. ¿Cómo va tu hidratación hoy? No olvides beber agua. <3"
    var visibleTextCount by remember { mutableStateOf(0) }

    LaunchedEffect(fullText) {
        for(i in 1..fullText.length){
            visibleTextCount = i
            delay(50)
        }
    }
    Row(
        modifier = Modifier.fillMaxHeight(),
        horizontalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Image(painter = imageW, contentDescription = "Waifu image", modifier = Modifier.size(120.dp))
            Spacer(modifier= Modifier.height(20.dp))
        }
        Box(
            modifier = Modifier
                .size(width = 20.dp, height = 100.dp)
                .drawBehind {
                    //love iu clippathmaker
                    val path = Path().apply {

                        moveTo(size.width, size.height * 0.5f)
                        lineTo(0f, size.height * 0.7f)
                        lineTo(size.width, size.height * 0.8f)
                        close()
                    }
                    drawPath(path = path, color = Color.White)
                }
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                    .padding(5.dp)
                    .border(width = 0.dp, color = Color.Transparent, shape = RoundedCornerShape(10.dp))
            ) {
                Text(fullText.take(visibleTextCount))
            }
        }
    }
}