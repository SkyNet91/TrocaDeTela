package com.example.telas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Screen5(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Screen 5") }
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Screen 5")
            Button(onClick = {navController.navigate(Destination.ScreenFirst.route)}) {
                Text(text = "Next")
            }
            Button(onClick = {navController.navigateUp()}) {
                Text(text = "Back")
            }
        }
    }
}