package com.example.zoomapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.R
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.model.Restaurants

class RestaurantCardAdapter (
        private val context: Context,
        private val dataset: List<Restaurants>)
        : RecyclerView.Adapter<RestaurantCardAdapter.RestaurantViewHolder>(){


        class RestaurantViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
                val textView: TextView = view.findViewById(R.id.name_textView)
                val imageView: ImageView = view.findViewById(R.id.restaurant_imageView)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
                val adapterLayout = LayoutInflater.from(parent.context)
                        .inflate(R.layout.list_restaurant, parent, false)
                        return RestaurantViewHolder(adapterLayout)
                }


        override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
                val item = dataset[position]
                holder.textView.text = context.resources.getString(item.stringResourceId)
                holder.imageView?.setImageResource(item.imageResourceId)
        }

        override fun getItemCount() = dataset.size

}
