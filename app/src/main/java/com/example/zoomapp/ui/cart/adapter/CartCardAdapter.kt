package com.example.zoomapp.ui.cart.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.databinding.ListCartBinding
import com.example.zoomapp.model.Cart

class CartCardAdapter : RecyclerView.Adapter<CartViewHolder>() {

    private val cartList = mutableListOf<Cart>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(ListCartBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.render(cartList[position])
    }

    fun setItems(newItems: List<Cart>) {
        cartList.clear()
        cartList.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = cartList.size

}