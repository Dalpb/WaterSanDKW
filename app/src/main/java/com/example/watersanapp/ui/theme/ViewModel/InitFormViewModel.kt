package com.example.watersanapp.ui.theme.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.watersanapp.ui.theme.Model.FormUser

class InitFormViewModel : ViewModel(){

    var _formUser by mutableStateOf<FormUser>(FormUser())

    fun onChangeName (name: String){
        _formUser = _formUser.copy(name= name)
    }
    fun onChangeAge(age: String){
        val ageR = age.toIntOrNull() ?: 0
        _formUser = _formUser.copy(age = ageR)
    }
    fun onChangeWeight(w: String){
        val wR = w.toFloatOrNull() ?: 0f
        _formUser = _formUser.copy(weight = wR)
    }

    fun onSubmit(){
        println(_formUser)
    }
}