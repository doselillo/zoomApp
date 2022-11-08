package com.example.zoomapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.zoomapp.databinding.FragmentAuthBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_auth.*



class AuthFragment : Fragment() {

    private var _binding: FragmentAuthBinding? = null
    private val binding get() = _binding!!
    private var auth: FirebaseAuth = FirebaseAuth.getInstance()
    //private val db = FirebaseFirestore.getInstance()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAuthBinding.inflate(inflater, container, false)
        val root = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            authFragment = this@AuthFragment
        }
    }

    fun signUp(){

        val email = emailLoginEdit.text.toString()
        if (emailLoginEdit.text.isNotEmpty() && passwordLoginEdit.text.isNotEmpty()){
            auth.createUserWithEmailAndPassword(
                emailLoginEdit.text.toString(), passwordLoginEdit.text.toString())
                .addOnCompleteListener { it ->

                    if (it.isSuccessful){
                        showHome(email)
                    }else{
                        Toast.makeText(requireContext(), "Email or password incorrect", Toast.LENGTH_SHORT).show()
                    }
                }
        }else{
            Toast.makeText(requireContext(), "Fill all texts", Toast.LENGTH_SHORT).show()
        }
    }

    //logs in the user if the email and password are correct
    fun login() {
        val email = emailLoginEdit.text.toString()
        if (emailLoginEdit.text.isNotEmpty() && passwordLoginEdit.text.isNotEmpty()){
            auth.signInWithEmailAndPassword(
                email, passwordLoginEdit.text.toString()
            ).addOnCompleteListener { it ->
                if (it.isSuccessful){
                    showHome(email)
                }else{
                    Toast.makeText(requireContext(), "Email or password incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        }else{
            Toast.makeText(requireContext(), "Fill all texts", Toast.LENGTH_SHORT).show()
        }
    }


    //navigates to the menu fragment carrying the email of the user
    private fun showHome(email: String) {
        val action = AuthFragmentDirections.actionAuthFragmentToRestaurantsFragment(email)
        findNavController().navigate(action)
    }


}