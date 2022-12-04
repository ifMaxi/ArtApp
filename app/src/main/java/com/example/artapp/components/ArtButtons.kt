package com.example.artapp.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * This function will only contain the buttons of the app (back, next).
 */
@Composable
fun ArtButtons(
    @StringRes action: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Reusable button
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
        elevation = ButtonDefaults.elevatedButtonElevation(8.dp),
        modifier = modifier
            .height(50.dp)
            .width(150.dp)
    ) {
        Text(
            text = stringResource(id = action),
            fontSize = 20.sp,
            modifier = modifier
        )
    }
}