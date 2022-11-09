package com.example.zoomapp.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.zoomapp.R
import com.example.zoomapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ZoomApp)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTheme(R.style.Theme_ZoomApp)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
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
                        dialPhone()
                        true
                    }
                    else -> false
                }
            }

        }

    }

    //function to launch intent to open contacts app
    private fun dialPhone() {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:123456789")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}