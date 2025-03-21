package com.flipperdevices.ui.options

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import busystatusbar.components.core.ui.res_preview.generated.resources.ic_preview_work
import com.flipperdevices.bsb.core.theme.BusyBarThemeInternal
import com.flipperdevices.bsb.core.theme.LocalCorruptedPallet
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import busystatusbar.components.core.ui.res_preview.generated.resources.Res as PreviewRes

@Composable
fun OptionSwitch(
    text: String,
    onCheckChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    iconTint: Color = LocalCorruptedPallet.current
        .transparent
        .whiteInvert
        .secondary
        .copy(alpha = 0.3f),
    isEnabled: Boolean = true,
    checked: Boolean = true,
    infoText: String? = null,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(
            8.dp,
            Alignment.CenterHorizontally
        ),
        verticalAlignment = verticalAlignment
    ) {
        icon?.let { icon ->
            Icon(
                painter = icon,
                contentDescription = null,
                tint = iconTint,
                modifier = Modifier.size(20.dp)
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = text,
                color = LocalCorruptedPallet.current
                    .white
                    .invert,
                textAlign = TextAlign.Start,
                fontSize = 18.sp
            )
            infoText?.let {
                Spacer(Modifier.height(8.dp))
                Text(
                    text = infoText,
                    color = LocalCorruptedPallet.current
                        .transparent
                        .whiteInvert
                        .secondary
                        .copy(alpha = 0.3f),
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Start,
                )
            }
        }
        M3Switch(
            checked = checked,
            onCheckedChange = onCheckChange,
            enabled = isEnabled,
        )
    }
}

@Composable
@Preview
@Suppress("LongMethod")
private fun OptionSwitchPreview() {
    val modifier = Modifier.padding(
        horizontal = 8.dp,
        vertical = 4.dp
    )
    BusyBarThemeInternal {
        Column {
            OptionSwitch(
                icon = painterResource(PreviewRes.drawable.ic_preview_work),
                text = TEXT,
                onCheckChange = {},
                modifier = modifier
            )
            OptionSeparator(Modifier.fillMaxWidth())
            OptionSwitch(
                icon = painterResource(PreviewRes.drawable.ic_preview_work),
                text = LONG_TEXT,
                checked = false,
                onCheckChange = {},
                modifier = modifier
            )
            OptionSeparator(Modifier.fillMaxWidth())
            OptionSwitch(
                icon = painterResource(PreviewRes.drawable.ic_preview_work),
                text = TEXT,
                infoText = TEXT,
                checked = true,
                isEnabled = false,
                onCheckChange = {},
                modifier = modifier
            )
            OptionSeparator(Modifier.fillMaxWidth())
            OptionSwitch(
                icon = painterResource(PreviewRes.drawable.ic_preview_work),
                text = LONG_TEXT,
                infoText = TEXT,
                checked = false,
                isEnabled = true,
                onCheckChange = {},
                modifier = modifier
            )
            OptionSeparator(Modifier.fillMaxWidth())
            OptionSwitch(
                icon = painterResource(PreviewRes.drawable.ic_preview_work),
                text = LONG_TEXT,
                infoText = LONG_TEXT,
                onCheckChange = {},
                modifier = modifier
            )
            OptionSeparator(Modifier.fillMaxWidth())
            OptionSwitch(
                icon = painterResource(PreviewRes.drawable.ic_preview_work),
                text = TEXT,
                infoText = LONG_TEXT,
                onCheckChange = {},
                modifier = modifier
            )
        }
    }
}
