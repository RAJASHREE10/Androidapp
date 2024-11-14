package com.example.projectone.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define dark color schemes with deep, space-inspired tones
private val DarkColorPalette = darkColors(
    primary = DarkNeptuneBlue,
    primaryVariant = DarkPlum,
    secondary = AuroraTeal,              // Soft teal for a hint of contrast and visual interest
    secondaryVariant = MarsRust,         // Mars-like red for an accent on certain components
    background = DeepSpaceBlack,         // Very dark black as the background, creating a space feel
    surface = MoonGray,                  // Dark gray for surfaces, for a moon-like appearance
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = MeteoriteSilver          // Metallic gray for an added cosmic touch on surfaces
)

@Composable
fun ProjectOneTheme(
    darkTheme: Boolean = true, // Default to dark theme for a space-inspired look
    content: @Composable () -> Unit
) {
    val colors = DarkColorPalette

    androidx.compose.material.MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
