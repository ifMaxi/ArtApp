package com.example.artapp.components

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Title art's
 */
@Composable
fun ArtText(
    @StringRes title: Int,
    fWeight: FontWeight,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = title),
        fontSize = 34.sp,
        fontWeight = fWeight
    )
}