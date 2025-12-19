package com.example.watersanapp.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.watersanapp.View.HomeView
import com.example.watersanapp.View.InitialFormView
import com.example.watersanapp.View.InitialView
import com.example.watersanapp.ui.theme.Layout.AppLayout
import com.example.watersanapp.ui.theme.ViewModel.HomeViewModel
import com.example.watersanapp.ui.theme.ViewModel.InitFormViewModel

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home"){
        composable("Init") {
            InitialView(navController)
        }
        composable("FormInit") {
            val initFormVM = viewModel<InitFormViewModel>()
            InitialFormView(navController,initFormVM)
        }
        composable("Home") {
            val homeVM = viewModel<HomeViewModel>()
            HomeView(navController,homeVM)
        }
    }
}