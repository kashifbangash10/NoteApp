package com.example.noteappwithmvvm.ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.noteappwithmvvm.R
import com.example.noteappwithmvvm.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.addbtn.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_homeFragment3_to_addNoteFragment4)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//
//        binding.addbtn.setOnClickListener{
//            Navigation.findNavController(it).navigate(R.id.action_homeFragment3_to_addNoteFragment4)
//        }

            }
}