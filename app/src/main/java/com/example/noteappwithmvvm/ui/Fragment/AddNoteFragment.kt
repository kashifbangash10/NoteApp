package com.example.noteappwithmvvm.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

import com.example.noteappwithmvvm.databinding.FragmentAddNoteBinding

import java.text.SimpleDateFormat
import java.util.*

class AddNoteFragment : Fragment() {
    private var _binding: FragmentAddNoteBinding? = null
    private val binding get() = _binding!!

    // Initialize the ViewModel
 //   private val viewModel: NotesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Handle save button click
        binding.btncre.setOnClickListener {
            saveNote()
        }

//        // Observe changes in the notes list (optional, if displaying a list)
//        viewModel.getAllNotes().observe(viewLifecycleOwner, Observer { notesList ->
//            // This will be triggered when the list of notes is updated
//            notesList?.let {
//                Toast.makeText(
//                    requireContext(),
//                    "Notes updated: ${it.size} items",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        })
    }

    private fun saveNote() {
        val title = binding.titleInput.text.toString().trim()
        val subtitle = binding.subtitleInput.text.toString().trim()
        val content = binding.descriptionInput.text.toString().trim()

        // Validate input fields
        if (title.isEmpty() || subtitle.isEmpty() || content.isEmpty()) {
            Toast.makeText(requireContext(), "All fields are required!", Toast.LENGTH_SHORT).show()
            return
        }

//        // Generate the current date
//        val date = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).format(Date())
//
//        // Create a Notes object
//        val note = Notes(
//            title = title,
//            subtitle = subtitle,
//            content = content,
//            date = date
//        )
//
//        // Save the note using ViewModel
//        viewModel.addNotes(note)
//
//        Toast.makeText(requireContext(), "Note saved successfully!", Toast.LENGTH_SHORT).show()
//
//        // Clear input fields after saving
//        clearInputFields()
//    }

//    private fun clearInputFields() {
//        binding.titleInput.text.clear()
//        binding.subtitleInput.text.clear()
//        binding.descriptionInput.text.clear()
//    }
}
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
