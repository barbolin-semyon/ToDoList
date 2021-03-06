package com.example.todolist

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().window.statusBarColor = requireContext().getColor(R.color.blue_700)
        val binding = FragmentSplashBinding.inflate(inflater, container, false)

        binding.startBtn.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_listTaskFragment)
        }

        return binding.root
    }
}