package com.example.imdbtop100.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.imdbtop100.R
import com.example.imdbtop100.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.top100Movies.setOnClickListener {
            displayTop100Movies()
        }

    }
    fun displayTop100Movies()
    {
        binding?.mainActivity?.visibility = View.GONE
        binding?.container?.visibility = View.VISIBLE
        supportFragmentManager.beginTransaction().replace(R.id.container, TopMoviesFragment())
            .commit()

    }
}