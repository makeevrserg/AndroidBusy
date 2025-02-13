package com.flipperdevices.bsb.timer.common.composable.appbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import busystatusbar.components.bsb.timer.common.generated.resources.Res
import busystatusbar.components.bsb.timer.common.generated.resources.ic_arrow_right
import com.flipperdevices.bsb.core.theme.BusyBarThemeInternal
import com.flipperdevices.bsb.core.theme.LocalPallet
import com.flipperdevices.bsb.root.api.LocalRootNavigation
import com.flipperdevices.bsb.root.model.RootNavigationConfig
import com.flipperdevices.ui.button.BIconButton
import com.flipperdevices.ui.button.rememberPragmaticaTextStyle
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TimerAppBarComposable(
    statusType: StatusType,
    modifier: Modifier = Modifier,
    workPhaseText: String? = null,
) {
    Box(
        modifier = modifier.fillMaxWidth().padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.align(Alignment.CenterStart),
            contentAlignment = Alignment.Center
        ) {
        }

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically)
        ) {
            StatusComposable(
                type = statusType,
                modifier = Modifier.height(48.dp)
            )
            workPhaseText?.let {
                Text(
                    text = workPhaseText,
                    style = rememberPragmaticaTextStyle().copy(
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        color = LocalPallet.current.transparent
                            .whiteInvert
                            .tertiary
                            .copy(alpha = 0.1f)
                    )
                )
            }
        }
        Box(
            modifier = Modifier.align(Alignment.TopEnd),
            contentAlignment = Alignment.Center
        ) {
            val rootNavigation = LocalRootNavigation.current
            BIconButton(
                modifier = Modifier.size(44.dp),
                painter = painterResource(Res.drawable.ic_arrow_right),
                onClick = {
                    rootNavigation.push(RootNavigationConfig.Profile(null))
                },
                enabled = true,
            )
        }
    }
}

@Composable
@Preview
private fun TimerAppBarComposablePreview() {
    BusyBarThemeInternal {
        TimerAppBarComposable(
            statusType = StatusType.BUSY,
            workPhaseText = "1/4\nwork phase"
        )
    }
}
