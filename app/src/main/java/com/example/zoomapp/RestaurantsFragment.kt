package com.example.zoomapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.adapter.RestaurantCardAdapter
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.databinding.FragmentRestaurantsBinding


class RestaurantsFragment : Fragment() {

    private var binding: FragmentRestaurantsBinding? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    val myDataset = Datasource.loadRestaurants()
    //private var recyclerView: RecyclerView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_restaurants, container, false)
        binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity, myDataset)
        binding?.startFragment = this
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity)
*/

        binding?.recyclerViewRestaurants?.setOnClickListener { findNavController().navigate(R.id.action_restaurantsFragment_to_cartFragment) }
    }



}