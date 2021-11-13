package com.example.sidan.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sidan.R
import com.example.sidan.databinding.ActivityMainBinding
import com.example.sidan.databinding.FragmentLandingBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}