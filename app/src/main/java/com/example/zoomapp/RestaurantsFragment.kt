package com.example.zoomapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.adapter.RestaurantCardAdapter
import com.example.zoomapp.databinding.FragmentRestaurantsBinding
import com.example.zoomapp.model.Restaurants


class RestaurantsFragment : Fragment() {

    private var binding: FragmentRestaurantsBinding? = null

    //private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_restaurants, container, false)

        binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.startFragment = this
    }



}