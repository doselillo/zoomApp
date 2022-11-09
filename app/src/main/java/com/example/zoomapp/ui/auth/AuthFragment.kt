package com.example.zoomapp.ui.auth

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.zoomapp.R
import com.example.zoomapp.databinding.FragmentAuthBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_auth.*

class AuthFragment : Fragment() {

    private var _binding: FragmentAuthBinding? = null
    private val binding get() = _binding!!

    private var auth: FirebaseAuth = FirebaseAuth.getInstance()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.apply {
            signUpButton.setOnClickListener {
                signUp()
            }

            logInButton.setOnClickListener {
                login()
            }
        }
    }


    private fun signUp() {
        if (emailLoginEdit.text.isNotEmpty() && passwordLoginEdit.text.isNotEmpty()) {
            auth.createUserWithEmailAndPassword(
                emailLoginEdit.text.toString(), passwordLoginEdit.text.toString()
            ).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    showHome()
                } else {
                    Toast.makeText(requireContext(), "Email or password incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            Toast.makeText(requireContext(), "Fill all texts", Toast.LENGTH_SHORT).show()
        }
    }

    //logs in the user if the email and password are correct
    private fun login() {
        if (emailLoginEdit.text.isNotEmpty() && passwordLoginEdit.text.isNotEmpty()) {
            auth.signInWithEmailAndPassword(
                emailLoginEdit.text.toString(), passwordLoginEdit.text.toString()
            ).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    showHome()
                } else {
                    Toast.makeText(requireContext(), "Email or password incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            Toast.makeText(requireContext(), "Fill all texts", Toast.LENGTH_SHORT).show()
        }
    }

    //navigates to the menu fragment carrying the email of the user
    private fun showHome() {
        findNavController().navigate(AuthFragmentDirections.actionAuthFragmentToRestaurantsFragment())
    }


}