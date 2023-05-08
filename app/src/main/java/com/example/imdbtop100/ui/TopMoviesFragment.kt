package com.example.imdbtop100.ui

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.imdbtop100.R
import com.example.imdbtop100.databinding.FragmentTopMoviesBinding
import com.example.imdbtop100.viewmodel.TopMoviesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TopMoviesFragment : Fragment() {
    private val viewModel : TopMoviesViewModel by viewModels()
    var binding : FragmentTopMoviesBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_top_movies,container,false)
        viewModel.liveDataResponse.observe(viewLifecycleOwner) {
            Log.d(TAG, "onCreateView livedataResponse: ${it.toString()}")
        }
        return binding?.root
    }
}
