package com.satya.advweek4_160421048.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satya.advweek4_160421048.R
import com.satya.advweek4_160421048.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}