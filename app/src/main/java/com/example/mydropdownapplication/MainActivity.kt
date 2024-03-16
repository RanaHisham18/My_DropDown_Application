package com.example.mydropdownapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.mydropdownapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupSpinner(binding.spinner1, R.array.spinner1_items)
        setupSpinner(binding.spinner2, R.array.spinner2_items)
    }

    private fun setupSpinner(spinner: Spinner, spinnerItems: Int) {
        ArrayAdapter.createFromResource(
            this,
            spinnerItems,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter

        }
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Handle selection
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle the absence of selection
            }
    }
} }