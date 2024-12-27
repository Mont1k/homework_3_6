package com.example.homework_3_6_7

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_3_6_7.cakes.CakesActivity
import com.example.homework_3_6_7.databinding.ActivityMainBinding
import com.example.homework_3_6_7.drinks.DrinksActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            binding.cakes?.setOnClickListener {
                startActivity(Intent(this@MainActivity, CakesActivity::class.java))
            }
            binding.drinks?.setOnClickListener {
                startActivity(Intent(this@MainActivity, DrinksActivity::class.java))
            }

        }
    }
}