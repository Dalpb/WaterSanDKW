package com.example.watersanapp.ui.theme.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.watersanapp.ui.theme.Blue20


@Composable
fun Input(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = {
            Text(
                text = label,
                color = Color(0xFF9AA0B4)
            )
        },

        shape = RoundedCornerShape(10.dp),

        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Blue20,
            unfocusedBorderColor = Color(0xFFE0E3EB),
            focusedTextColor = Color(0xFF1F2A60),
            unfocusedTextColor = Color(0xFF1F2A60),
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        ),
        modifier = modifier
            .fillMaxWidth(0.85f)
            .height(52.dp)
    )

}