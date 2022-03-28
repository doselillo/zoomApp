package com.example.zoomapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Restaurants (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

data class Carts (
    @StringRes val name: Int,
    @StringRes val price: Int,
    @DrawableRes val add: Int
        )