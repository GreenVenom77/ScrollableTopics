package com.example.scrollabletopics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val integerResource: Int,
    @DrawableRes val imageResourceId: Int
)
