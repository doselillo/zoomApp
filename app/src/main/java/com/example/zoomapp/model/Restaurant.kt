package com.example.zoomapp.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.android.parcel.Parcelize

@Parcelize
sealed class Restaurant(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int, cart: List<Cart>) : Parcelable {

    @Parcelize
    data class Tagliatella(
        @StringRes val name: Int, @DrawableRes val image: Int, val cart: List<Cart>
    ) : Restaurant(name, image, cart), Parcelable

    @Parcelize
    data class CafeAmistat(
        @StringRes val name: Int, @DrawableRes val image: Int, val cart: List<Cart>
    ) : Restaurant(name, image, cart), Parcelable

    @Parcelize
    data class Biagios(
        @StringRes val name: Int, @DrawableRes val image: Int, val cart: List<Cart>
    ) : Restaurant(name, image, cart), Parcelable

}

