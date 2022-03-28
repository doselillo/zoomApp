package com.example.zoomapp.data

import com.example.zoomapp.R
import com.example.zoomapp.model.Restaurants

class Datasource() {

    fun loadRestaurants(): List<Restaurants>{
        return listOf<Restaurants>(
            Restaurants(R.string.tagliatella, R.drawable.logo_tagliatella),
            Restaurants(R.string.amistat, R.drawable.logo_amistat),
            Restaurants(R.string.Biagios, R.drawable.logo_biagios)
        )
    }

}