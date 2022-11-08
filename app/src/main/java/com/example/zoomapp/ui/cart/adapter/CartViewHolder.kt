package com.example.zoomapp.ui.cart.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.R
import com.example.zoomapp.databinding.ListCartBinding
import com.example.zoomapp.model.Cart

class CartViewHolder(private val binding: ListCartBinding) : RecyclerView.ViewHolder(binding.root) {

    fun render(cart: Cart) {
        binding.apply {
            restaurantName.text = root.context.getString(cart.name)
            description.text = root.context.getString(cart.description)
            price.text = root.context.getString(R.string.price, cart.price.value)
        }
    }

}