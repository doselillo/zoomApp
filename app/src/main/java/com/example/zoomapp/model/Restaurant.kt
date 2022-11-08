package com.example.zoomapp.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    @StringRes val name: Int, @DrawableRes val image: Int, val cartList: List<Cart>
) : Parcelable


