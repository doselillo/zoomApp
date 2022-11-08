package com.example.zoomapp.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgument
import com.example.zoomapp.databinding.FragmentCartBinding
import com.example.zoomapp.ui.cart.adapter.CartCardAdapter


class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<CartFragmentArgs>()

    private val cartAdapter: CartCardAdapter by lazy { CartCardAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
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
        binding.apply {
            restaurantDetailImage.setImageResource(args.restaurant.image)
            cartRecyclerView.adapter = cartAdapter
            cartAdapter.setItems(args.restaurant.cartList)
        }
    }
}