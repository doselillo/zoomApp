package com.example.zoomapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.adapter.CartCardAdapter
import com.example.zoomapp.adapter.RestaurantCardAdapter
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.databinding.FragmentCartBinding


class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!
    private var layoutManager: RecyclerView.LayoutManager? = null
    val myDataset = Datasource.Carts
    private lateinit var recyclerView: RecyclerView
    //private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*return inflater.inflate(R.layout.fragment_restaurants, container, false)
        binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
        binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity, myDataset)
        binding?.startFragment = this*/
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding!!.root

    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(view, savedInstanceState)
/*binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity)*/
        recyclerView = binding.cartRecyclerView
        binding?.cartRecyclerView?.layoutManager = LinearLayoutManager(activity)
        binding?.cartRecyclerView?.adapter = CartCardAdapter(activity, myDataset)

    }
}