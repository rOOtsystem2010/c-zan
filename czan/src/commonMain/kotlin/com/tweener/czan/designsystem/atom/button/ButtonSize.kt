package com.tweener.czan.designsystem.atom.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * @author Vivien Mahe
 * @since 24/08/2023
 */
enum class ButtonSize {
    BIG,
    REGULAR,
    SMALL;

    companion object {
        private val BigButtonHeight = 52.dp
        private val ButtonHeight = 40.dp
        private val SmallButtonHeight = 32.dp

        private val BigButtonIconSize = 22.dp
        private val ButtonIconSize = 18.dp
        private val SmallButtonIconSize = 10.dp

        private val BigButtonShape = RoundedCornerShape(36.dp)

        private val BigButtonWithTrailingIconHorizontalEndPadding = 16.dp
        private val BigButtonHorizontalPadding = 24.dp
        private val BigButtonVerticalPadding = 8.dp
        private val SmallButtonHorizontalPadding = 14.dp
        private val SmallButtonVerticalPadding = 8.dp
        private val SmallButtonWithIconHorizontalStartPadding = 12.dp
    }

    val height: Dp
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> BigButtonHeight
            REGULAR -> ButtonHeight
            SMALL -> SmallButtonHeight
        }

    val shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> BigButtonShape
            REGULAR -> MaterialTheme.shapes.extraLarge
            SMALL -> MaterialTheme.shapes.large
        }

    val textStyle: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> MaterialTheme.typography.bodyLarge
            REGULAR -> MaterialTheme.typography.bodyMedium
            SMALL -> MaterialTheme.typography.bodySmall
        }

    val contentPadding: PaddingValues
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> ButtonDefaults.ContentPadding
            REGULAR -> ButtonDefaults.ContentPadding
            SMALL -> PaddingValues(
                horizontal = SmallButtonHorizontalPadding,
                vertical = SmallButtonVerticalPadding
            )
        }

    val contentWithLeadingIconPadding: PaddingValues
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> ButtonDefaults.ButtonWithIconContentPadding
            REGULAR -> ButtonDefaults.ButtonWithIconContentPadding
            SMALL -> PaddingValues(
                start = SmallButtonWithIconHorizontalStartPadding,
                top = SmallButtonVerticalPadding,
                end = SmallButtonHorizontalPadding,
                bottom = SmallButtonVerticalPadding
            )
        }

    val contentWithTrailingIconPadding: PaddingValues
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> PaddingValues(
                start = BigButtonHorizontalPadding,
                top = BigButtonVerticalPadding,
                end = BigButtonWithTrailingIconHorizontalEndPadding,
                bottom = BigButtonVerticalPadding
            )

            REGULAR -> PaddingValues(
                start = BigButtonHorizontalPadding,
                top = BigButtonVerticalPadding,
                end = BigButtonWithTrailingIconHorizontalEndPadding,
                bottom = BigButtonVerticalPadding
            )

            SMALL -> PaddingValues(
                start = SmallButtonWithIconHorizontalStartPadding,
                top = SmallButtonVerticalPadding,
                end = SmallButtonHorizontalPadding,
                bottom = SmallButtonVerticalPadding
            )
        }

    val iconSize: Dp
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            BIG -> BigButtonIconSize
            REGULAR -> ButtonIconSize
            SMALL -> SmallButtonIconSize
        }
}
