package com.example.zoomapp.ui.restaurants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zoomapp.data.DataSource
import com.example.zoomapp.databinding.FragmentRestaurantsBinding
import com.example.zoomapp.ui.restaurants.adapter.RestaurantsAdapter


class RestaurantsFragment : Fragment() {

    private var _binding: FragmentRestaurantsBinding? = null
    private val binding get() = _binding!!

    private val restaurantsAdapter: RestaurantsAdapter by lazy {
        RestaurantsAdapter { restaurant ->
            findNavController().navigate(RestaurantsFragmentDirections.actionRestaurantsFragmentToCartFragment(restaurant))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRestaurantsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {
        binding.recyclerViewRestaurants.apply {
            adapter = restaurantsAdapter
            restaurantsAdapter.setItems(DataSource.getRestaurants())
        }
    }

}