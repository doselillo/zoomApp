package com.example.zoomapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.CartFragment
import com.example.zoomapp.R
import com.example.zoomapp.RestaurantsFragment
import com.example.zoomapp.RestaurantsFragmentDirections
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.databinding.FragmentRestaurantsBinding
import com.example.zoomapp.model.Restaurants
import com.google.android.material.appbar.MaterialToolbar
import javax.sql.DataSource

class RestaurantCardAdapter(
        private val context: FragmentActivity?,
        private val dataset: List<Restaurants>)
        : RecyclerView.Adapter<RestaurantCardAdapter.RestaurantViewHolder>(){

        private var _binding: FragmentRestaurantsBinding? = null
        private val binding get() = _binding!!
        val restList = Datasource.Restaurantes



        //private lateinit var binding: RestaurantsFragment

        class RestaurantViewHolder(view: View?) : RecyclerView.ViewHolder(view!!){
                val textView: TextView? = view?.findViewById(R.id.name_textView)
                val imageView: ImageView? = view?.findViewById(R.id.restaurant_imageView)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
                val adapterLayout = LayoutInflater.from(parent.context)
                        .inflate(R.layout.list_restaurant, parent, false)
                        return RestaurantViewHolder(adapterLayout)
                }


        override fun onBindViewHolder(holder: RestaurantViewHolder,position: Int) {
                val item = restList[position]
                holder.textView?.text = context?.resources?.getString(item.stringResourceId)
                holder.imageView?.setImageResource(item.imageResourceId)
                /*holder.itemView.setOnClickListener(
                        Navigation.createNavigateOnClickListener(R.id.action_restaurantsFragment_to_cartFragment)
                )*/
                /*holder.itemView.setOnClickListener{ view ->
                        view.findNavController().navigate(R.id.action_restaurantsFragment_to_cartFragment)
                }*/
                holder.imageView?.setOnClickListener {
                        val action = RestaurantsFragmentDirections.actionRestaurantsFragmentToCartFragment()
                        holder.imageView.findNavController().navigate(action)
                }

        }

        override fun getItemCount() = restList.size

}


