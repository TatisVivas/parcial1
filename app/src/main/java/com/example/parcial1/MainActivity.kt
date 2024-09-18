package com.example.parcial1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fatorial.setOnClickListener {
            startActivity(Intent(baseContext, factorialActivity::class.java))
        }
        binding.adivinar.setOnClickListener {
            startActivity(Intent(baseContext, AdivinadorActivity::class.java))
        }

    }
}