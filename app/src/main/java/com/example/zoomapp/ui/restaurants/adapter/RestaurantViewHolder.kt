package com.example.zoomapp.ui.restaurants.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.databinding.ListRestaurantBinding
import com.example.zoomapp.model.Restaurant

class RestaurantViewHolder(private val binding: ListRestaurantBinding) : RecyclerView.ViewHolder(binding.root) {

    fun render(restaurant: Restaurant, onCardClicked: (restaurant: Restaurant) -> Unit) {
        binding.apply {
            restaurantName.text = root.context.getString(restaurant.stringResourceId)
            restaurantImage.setImageResource(restaurant.imageResourceId)

            root.setOnClickListener {
                onCardClicked(restaurant)
            }
        }
    }

}