package com.example.zoomapp.ui.restaurants.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.databinding.ListRestaurantBinding
import com.example.zoomapp.model.Restaurant

class RestaurantsAdapter(
    private val onCardClicked: (restaurant: Restaurant) -> Unit
) : RecyclerView.Adapter<RestaurantViewHolder>() {

    private val restaurantsList = mutableListOf<Restaurant>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        return RestaurantViewHolder(ListRestaurantBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.render(restaurantsList[position], onCardClicked)
    }

    fun setItems(newItems: List<Restaurant>) {
        restaurantsList.clear()
        restaurantsList.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = restaurantsList.size

}


