package com.example.zoomapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.zoomapp.adapter.RestaurantCardAdapter
import com.example.zoomapp.data.Datasource
import com.example.zoomapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: FragmentAuthBinding
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.authFragment) {
                topAppBar.visibility = View.GONE
            } else {
                topAppBar.visibility = View.VISIBLE
            }
        }

        binding.topAppBar.apply {

            //home button
            setNavigationOnClickListener {

                //navigates to menu fragment
                navController.navigate(R.id.restaurantsFragment)
            }

            //other buttons
            setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {

                    //when phone button call number
                    R.id.contactIcon -> {
                        dialPhone("123456789")
                        true
                    }
                    else -> false
                }
            }
/*
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
*/

        }


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    //function to launch intent to open contacts app
    private fun dialPhone(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}