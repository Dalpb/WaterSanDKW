package com.example.watersanapp.ui.theme.Components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.watersanapp.ui.theme.Blue10

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    onclick: ()->Unit,
    content: @Composable ()-> Unit){
    Button(
        modifier = modifier.size(160.dp, 50.dp),
        onClick = onclick,
        colors = ButtonDefaults.buttonColors(containerColor = Blue10),
        shape = RoundedCornerShape(10.dp)
    ) {
        content()
    }
}

