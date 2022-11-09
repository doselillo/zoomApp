package com.example.zoomapp.data

import com.example.zoomapp.R
import com.example.zoomapp.model.Price
import com.example.zoomapp.model.Cart
import com.example.zoomapp.model.Restaurant

object DataSource {

    fun getRestaurants(): List<Restaurant> {
        return listOf(
            Restaurant(R.string.tagliatella, R.drawable.logo_tagliatella, tagliatellaCart),
            Restaurant(R.string.amistat, R.drawable.logo_amistat, cafeAmistatCart),
            Restaurant(R.string.Biagios, R.drawable.logo_biagios, biagiosCart)
        )
    }

    val tagliatellaCart: List<Cart> = listOf(
        Cart(R.string.jamon_queso, R.string.description, Price.TEN),
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
        Cart(R.string.café, R.string.description, Price.TEN),
        Cart(R.string.coca_cola, R.string.description, Price.ELEVEN),
        Cart(R.string.agua, R.string.description, Price.TWELVE),
        Cart(R.string.tortilla, R.string.description, Price.TEN),
        Cart(R.string.tostadas, R.string.description, Price.ELEVEN),
        Cart(R.string.leche, R.string.description, Price.TWELVE),
        Cart(R.string.zumo, R.string.description, Price.TEN)
    )

    val biagiosCart: List<Cart> = listOf(
        Cart(R.string.item_1, R.string.description, Price.TEN),
        Cart(R.string.item_2, R.string.description, Price.ELEVEN),
        Cart(R.string.item_3, R.string.description, Price.TWELVE),
        Cart(R.string.item_4, R.string.description, Price.TEN),
        Cart(R.string.item_5, R.string.description, Price.ELEVEN),
        Cart(R.string.item_6, R.string.description, Price.TWELVE),
        Cart(R.string.item_7, R.string.description, Price.TEN)
    )


}