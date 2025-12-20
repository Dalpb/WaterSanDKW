package com.example.watersanapp.ui.theme.ViewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(){

    var currentProgress by mutableStateOf<Float>(0f)
    val goal by mutableStateOf<Float>(2200f)

    fun addProgress(quantity: Float){
        currentProgress += quantity
    }

}