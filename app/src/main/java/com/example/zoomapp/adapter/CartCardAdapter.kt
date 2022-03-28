package com.example.zoomapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.R
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.model.Carts

class CartCardAdapter(
    private val context: FragmentActivity?,
    private val dataSet: List<Carts>) : RecyclerView.Adapter<CartCardAdapter.CartViewHolder>(){

    val cartList = Datasource.Carts


    class CartViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val nameTextView: TextView = view.findViewById(R.id.name_textView)
        val priceTextView: TextView = view.findViewById(R.id.price_textView)
        val infoTextView: TextView = view.findViewById(R.id.info_textView)
        val addImageView: ImageView? = view?.findViewById(R.id.add_imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_cart, parent, false)
        return CartViewHolder(adapterLayout)
    }

    @SuppressLint("StringFormatMatches")
    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartList[position]
        holder.nameTextView?.text = context?.resources?.getString(item.name)
        holder.infoTextView?.text = context?.resources?.getString(item.description)
        holder.priceTextView?.text = context?.resources?.getString(R.string.price, item.price)

    }

    override fun getItemCount()= dataSet.size
}