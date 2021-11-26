package com.example.davaleba4.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.davaleba4.R
import androidx.appcompat.app.AppCompatActivity




class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var amountEditText: EditText
    private lateinit var sendButton : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        amountEditText= view.findViewById(R.id.editTextAmount)
        sendButton= view.findViewById(R.id.buttonSend)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val amountText = amountEditText.text.toString()

            if (amountText.isEmpty()) {
                return@setOnClickListener
            }

            val amount = amountText.toInt()
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)


            navController.navigate(action)

        }}}