package com.flipperdevices.bsb.core.theme

import androidx.compose.animation.core.tween
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimation
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimationProvider
import com.arkivanov.decompose.extensions.compose.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation

object BusyBarAnimationProvider : StackAnimationProvider {
    override fun <C : Any, T : Any> provide(): StackAnimation<C, T> {
        return stackAnimation(
            fade(
                tween(durationMillis = 400)
            )
        )
    }
}
