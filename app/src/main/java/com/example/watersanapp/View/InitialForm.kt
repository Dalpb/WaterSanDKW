package com.example.watersanapp.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.watersanapp.R
import com.example.watersanapp.ui.theme.Blue20
import com.example.watersanapp.ui.theme.Components.Input
import com.example.watersanapp.ui.theme.Components.PrimaryButton
import com.example.watersanapp.ui.theme.HomenajeFont
import com.example.watersanapp.ui.theme.ViewModel.InitFormViewModel
import com.example.watersanapp.ui.theme.White10
import com.example.watersanapp.ui.theme.Yellow10

@Composable
fun InitialFormView(navController : NavController, viewModel: InitFormViewModel){

    var stateForm = viewModel._formUser
    val imageLogo = painterResource(R.drawable.tear_logo_v2)
    val imageArm = painterResource(R.drawable.tear_arm)

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
            Box() {
                Image(
                    painter = imageLogo,
                    contentDescription = "Represent the logo image",
                    modifier = Modifier.size(100.dp).offset(y = (-80).dp,x=40.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth(.9f)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .border(3.dp, Color.Transparent, RoundedCornerShape(10.dp))
                        .padding(2.dp, 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(18.dp)
                ) {
                    Text(
                        "Tus Datos",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 25.sp
                    )
                    Text(
                        "Introduce tus datos para iniciar",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF1F2A60),
                    )
                    Column() {
                        Text("Nombre", fontWeight = FontWeight.Medium)
                        Input(
                            value = stateForm.name,
                            onValueChange = viewModel::onChangeName,
                            label = "Tu nombre"
                        )
                    }
                    Column() {
                        Text("Peso (Kg)", fontWeight = FontWeight.Medium)
                        Input(
                            value = stateForm.weight.toString(),
                            onValueChange = viewModel::onChangeWeight,
                            label = "Tu peso en kilogramos"
                        )
                    }
                    Column() {
                        Text("Edad", fontWeight = FontWeight.Medium)
                        Input(
                            value = stateForm.age.toString(),
                            onValueChange = viewModel::onChangeAge,
                            label = "Tu edad"
                        )
                    }
                    Row() {
                        PrimaryButton(onclick = {}) {
                            Text(
                                "Continuar",
                                fontSize = 25.sp,
                                fontFamily = HomenajeFont,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
                Box() {
                    //TODO: MOdify the image it does not make sense
                    Image(
                        painter = imageArm,
                        contentDescription = "Represent the logo image",
                        modifier = Modifier.size(60.dp).offset(y = (0).dp, x = 26.dp)
                    )
                }
            }
        }

    }
}