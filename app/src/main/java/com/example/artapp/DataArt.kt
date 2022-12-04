package com.example.artapp

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.painter.Painter

data class DataArt(
    @StringRes val name: Int,
    val painter: Painter
)
