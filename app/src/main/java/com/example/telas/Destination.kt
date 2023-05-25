package com.example.telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


sealed class Destination(val route: String) {
    object ScreenFirst : Destination("ScreenFirst")
    object ScreenSecond : Destination("ScreenSecond")
    object ScreenThird : Destination("ScreenThird")
    object ScreenFourth : Destination("ScreenFourth")
    object ScreenFive : Destination("ScreenFive")

}

