package com.example.zoomapp.model

import android.os.Parcelable
import androidx.annotation.StringRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cart(
    @StringRes val name: Int, @StringRes val description: Int, val price: Price
) : Parcelable