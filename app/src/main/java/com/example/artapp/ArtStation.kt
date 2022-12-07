package com.example.artapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artapp.ui.theme.*
import com.example.artspace.R

val fakeDB: FakeDatabase = FakeDatabase()

@Composable
fun ArtApp() {
    ArtStationScreen()
}

/**
 * Show all the content in the screen
 */
@Composable
fun ArtStationScreen(modifier: Modifier = Modifier) {
    val mySpace = modifier.padding(16.dp) // Modifier space

    // State
    var showImage by remember { mutableStateOf(0) }
    
    // Gradient list
    val colorGradient = listOf(
        YellowG,
        AmberG,
        OrangeG,
        DeepOrangeG
    )

    Column(
        modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(colorGradient)),
        verticalArrangement = Arrangement.Center
    ) {
        Surface(
            modifier = Modifier
                .border(width = 2.dp, color = Color.DarkGray)
                .align(alignment = CenterHorizontally),
            elevation = 10.dp
        ) {
            Image(
                painter = painterResource(
                    id = fakeDB.setAll[showImage].imgRes
                ),
                contentDescription = stringResource(
                    id = fakeDB.setAll[showImage].description
                ),
            )
        }
        Spacer(mySpace)
        Row(
            modifier = Modifier
                .align(alignment = CenterHorizontally)
        ) {
            Text(
                text = stringResource(id = fakeDB.setAll[showImage].description),
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(mySpace)
        Row(
            modifier = Modifier
                .align(alignment = CenterHorizontally)
        ) {
            Button(
                onClick = { if (showImage != 0) showImage -= 1 },
                colors = ButtonDefaults.buttonColors(Red300),
                elevation = ButtonDefaults.elevatedButtonElevation(8.dp),
                modifier = modifier
                    .height(50.dp)
                    .width(150.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.back),
                    fontSize = 20.sp,
                    modifier = modifier,
                    color = Color.Black
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = { if (showImage < 5) showImage += 1 },
                colors = ButtonDefaults.buttonColors(Red300),
                elevation = ButtonDefaults.elevatedButtonElevation(8.dp),
                modifier = modifier
                    .height(50.dp)
                    .width(150.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.next),
                    fontSize = 20.sp,
                    modifier = modifier,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ArtPreview() {
    ArtAppTheme {
        ArtApp()
    }
}