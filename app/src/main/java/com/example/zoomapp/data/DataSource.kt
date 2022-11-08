package com.example.zoomapp.data

import com.example.zoomapp.R
import com.example.zoomapp.model.Price
import com.example.zoomapp.model.Cart
import com.example.zoomapp.model.Restaurant

object DataSource {

    fun getRestaurants(): List<Restaurant> {
        return listOf<Restaurant>(
            Restaurant.Tagliatella(R.string.tagliatella, R.drawable.logo_tagliatella, tagliatellaCart),
            Restaurant.CafeAmistat(R.string.amistat, R.drawable.logo_amistat, cafeAmistatCart),
            Restaurant.Biagios(R.string.Biagios, R.drawable.logo_biagios, biagiosCart)
        )
    }

    val tagliatellaCart: List<Cart> = listOf(
        Cart(R.string.pizzas, R.string.description, Price.TEN),
        Cart(R.string.boloñesa, R.string.description, Price.ELEVEN),
        Cart(R.string.carbonara, R.string.description, Price.TWELVE),
        Cart(R.string.cuatro_quesos, R.string.description, Price.TEN),
        Cart(R.string.jamon_queso, R.string.description, Price.TEN),
        Cart(R.string.pollo, R.string.description, Price.TWELVE),
        Cart(R.string.tarada, R.string.description, Price.ELEVEN),
        Cart(R.string.pizzas, R.string.description, Price.TEN),
        Cart(R.string.boloñesa, R.string.description, Price.ELEVEN),
        Cart(R.string.carbonara, R.string.description, Price.TWELVE),
        Cart(R.string.cuatro_quesos, R.string.description, Price.TEN),
        Cart(R.string.jamon_queso, R.string.description, Price.TEN),
        Cart(R.string.pollo, R.string.description, Price.TWELVE),
        Cart(R.string.tarada, R.string.description, Price.ELEVEN)
    )

    val cafeAmistatCart: List<Cart> = listOf(
        Cart(R.string.pizzas, R.string.description, Price.TEN),
        Cart(R.string.boloñesa, R.string.description, Price.ELEVEN),
        Cart(R.string.carbonara, R.string.description, Price.TWELVE)
    )

    val biagiosCart: List<Cart> = listOf(
        Cart(R.string.pizzas, R.string.description, Price.TEN),
        Cart(R.string.boloñesa, R.string.description, Price.ELEVEN),
        Cart(R.string.carbonara, R.string.description, Price.TWELVE),
        Cart(R.string.cuatro_quesos, R.string.description, Price.TEN),
        Cart(R.string.jamon_queso, R.string.description, Price.TEN),
        Cart(R.string.pollo, R.string.description, Price.TWELVE)
    )


}