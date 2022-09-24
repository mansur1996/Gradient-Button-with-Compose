package com.example.gradientbuttonwithcompose1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onclick: () -> Unit
) {


    Button(
        colors = buttonColors(backgroundColor = Color.Transparent),
        onClick = { onclick() },
        contentPadding = PaddingValues()
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Button", color = Color.White)
        }
    }
}

@Preview
@Composable
fun GradientButtonPreview() {
    GradientButton(
        "MyButton",
        textColor = Color.White,
        Brush.horizontalGradient(
            colors = listOf(
                Color.Green,
                Purple700,
                Purple200
            )
        )
    ) {

    }
}