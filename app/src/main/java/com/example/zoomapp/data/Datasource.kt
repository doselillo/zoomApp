package com.example.zoomapp.data

import com.example.zoomapp.R
import com.example.zoomapp.const.Price
import com.example.zoomapp.model.Carts
import com.example.zoomapp.model.Restaurants

object Datasource {

    fun loadRestaurants(): List<Restaurants>{
        return listOf<Restaurants>(
            Restaurants(R.string.tagliatella, R.drawable.logo_tagliatella),
            Restaurants(R.string.amistat, R.drawable.logo_amistat),
            Restaurants(R.string.Biagios, R.drawable.logo_biagios)
        )
    }
    val Restaurantes: List<Restaurants> = listOf(
    Restaurants(R.string.tagliatella, R.drawable.logo_tagliatella),
    Restaurants(R.string.amistat, R.drawable.logo_amistat),
    Restaurants(R.string.Biagios, R.drawable.logo_biagios)
    )

   /* val Carts: List<Carts> = listOf(
        Carts(R.string.pizzas, Price.TEN , R.drawable.ic_baseline_add_24),
        Carts(R.string.boloñesa, Price.ELEVEN, R.drawable.ic_baseline_add_24),
        Carts(R.string.carbonara, Price.TWELVE, R.drawable.ic_baseline_add_24),
        Carts(R.string.cuatro_quesos, Price.TEN, R.drawable.ic_baseline_add_24),
        Carts(R.string.jamon_queso, Price.TEN, R.drawable.ic_baseline_add_24),
        Carts(R.string.pollo, Price.TWELVE, R.drawable.ic_baseline_add_24),
        Carts(R.string.tarada, Price.ELEVEN, R.drawable.ic_baseline_add_24)
    )*/

    val tagliatellaCart = mapOf(
        "pizza" to
                Carts(
                    name = R.string.pizzas,
                    description = R.string.description,
                    price = null,
                    add = R.drawable.ic_baseline_add_24
                ),
        "boloñesa" to
                Carts(
                    name = R.string.boloñesa,
                    description = R.string.description,
                    price = 10.00,
                    add = R.drawable.ic_baseline_add_24
                ),
        "carbonara" to
                Carts(
                    name = R.string.carbonara,
                    description = R.string.description,
                    price = 10.50,
                    add = R.drawable.ic_baseline_add_24
                ),
        "jamonqueso" to
                Carts(
                    name = R.string.jamon_queso,
                    description = R.string.description,
                    price = 12.00,
                    add = R.drawable.ic_baseline_add_24
                ),
        "cuatroquesos" to
                Carts(
                    name = R.string.cuatro_quesos,
                    description = R.string.description,
                    price = 13.50,
                    add = R.drawable.ic_baseline_add_24
                ),
        "pollo" to
                Carts(
                    name = R.string.pollo,
                    description = R.string.description,
                    price = 9.50,
                    add = R.drawable.ic_baseline_add_24
                ),
        "tarada" to
                Carts(
                    name = R.string.tarada,
                    description = R.string.description,
                    price = 8.00,
                    add = R.drawable.ic_baseline_add_24
                ),
    )

}