package es.alvaro.serna.cuadricula.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResId: Int,
    val postNumber: Int,
    @DrawableRes val drawableResId: Int
)
