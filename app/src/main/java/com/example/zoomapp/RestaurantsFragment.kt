package com.example.zoomapp

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

    private var _binding: FragmentRestaurantsBinding? = null
    private val binding get() = _binding!!
    private var layoutManager: RecyclerView.LayoutManager? = null
    private val myDataset = Datasource.loadRestaurants()
    //private var recyclerView: RecyclerView? = null
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*return inflater.inflate(R.layout.fragment_restaurants, container, false)
        binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity, myDataset)
        binding?.startFragment = this*/
        _binding = FragmentRestaurantsBinding.inflate(inflater, container, false)
        return binding!!.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /*super.onViewCreated(view, savedInstanceState)
        binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity, myDataset)
        val myDataset = Datasource.loadRestaurants()*/
        recyclerView = binding.recyclerViewRestaurants
        binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity, myDataset)
        //chooseLayout()

        binding?.recyclerViewRestaurants?.setOnClickListener { findNavController().navigate(R.id.action_restaurantsFragment_to_cartFragment) }
    }



}