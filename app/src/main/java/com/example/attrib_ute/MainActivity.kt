package com.example.attrib_ute

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.attrib_ute.databinding.ActivityMainBinding

import androidx.core.content.ContextCompat.getColor

import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { setBlackText() }
        binding.button2.setOnClickListener { setRedText() }
        binding.button3.setOnClickListener { setLargeText() }
        binding.button4.setOnClickListener { setSmallText() }
        binding.button5.setOnClickListener { setWhiteBackground() }
        binding.button6.setOnClickListener { setYellowBackground() }
    }

    private fun setBlackText() {
        binding.editTextText.setTextColor(Color.BLACK)
    }

    private fun setRedText() {
        binding.editTextText.setTextColor(Color.RED)
    }

    private fun setSmallText() {
        binding.editTextText.setTextSize(8F)
    }

    private fun setLargeText() {
        binding.editTextText.setTextSize(24F)
    }

    private fun setWhiteBackground() {
        binding.editTextText.setBackgroundColor(Color.WHITE)
    }

    private fun setYellowBackground() {
        binding.editTextText.setBackgroundColor(Color.YELLOW)
    }

}
