package com.example.zoomapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.adapter.CartCardAdapter
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.databinding.FragmentCartBinding


class CartFragment : Fragment() {

    private var binding: FragmentCartBinding? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    val myDataset = Datasource.Carts
    //private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_cart, container, false)
            binding?.cartRecyclerView?.layoutManager = LinearLayoutManager(activity)
            binding?.cartRecyclerView?.adapter = CartCardAdapter(activity, myDataset)

        }


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*binding?.recyclerViewRestaurants?.layoutManager = LinearLayoutManager(activity)
binding?.recyclerViewRestaurants?.adapter = RestaurantCardAdapter(activity)*/
    }
}