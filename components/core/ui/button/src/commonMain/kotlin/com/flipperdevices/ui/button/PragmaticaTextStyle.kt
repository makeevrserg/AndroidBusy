package com.flipperdevices.ui.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.flipperdevices.bsb.core.theme.LocalBusyBarFonts

@Composable
fun rememberPragmaticaTextStyle(): TextStyle {
    return TextStyle(
//        lineHeight = 24.sp,
//        lineHeightStyle = LineHeightStyle(
//            alignment = LineHeightStyle.Alignment.Bottom,
//            trim = LineHeightStyle.Trim.LastLineBottom
//        ),
        fontFamily = LocalBusyBarFonts.current.pragmatica,
    )
}
