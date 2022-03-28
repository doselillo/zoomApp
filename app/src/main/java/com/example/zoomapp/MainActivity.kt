package com.example.zoomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.adapter.RestaurantCardAdapter
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.databinding.FragmentRestaurantsBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FragmentRestaurantsBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentRestaurantsBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_restaurants)

        // Initialize data.
       val myDataset = Datasource.loadRestaurants()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_restaurants)
        recyclerView.adapter = RestaurantCardAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
        /*binding.recyclerViewRestaurants.adapter = RestaurantCardAdapter(
            applicationContext)

        // Specify fixed size to improve performance
        binding.recyclerViewRestaurants.setHasFixedSize(true)*/
    }
}