package com.example.bitsandpizzas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.example.bitsandpizzas.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {
    private var _binding: FragmentOrderBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrderBinding.inflate(inflater, container, false)
        val view = binding.root
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
