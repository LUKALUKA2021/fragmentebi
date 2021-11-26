package com.example.davaleba4.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.davaleba4.R

class PhotoFragment : Fragment(R.layout.fragment_photo) {

    private lateinit var notesButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notesButton= view.findViewById(R.id.buttonNotes)

        val navController = Navigation.findNavController(view)

        notesButton.setOnClickListener{
            val action2= PhotoFragmentDirections.actionPhotoFragmentToNoteFragment()
            navController.navigate(action2)
        }



    }
}