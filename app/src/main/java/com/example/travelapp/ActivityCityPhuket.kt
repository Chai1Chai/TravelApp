package com.example.travelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityCityPhuket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_city_phuket)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupBack()
        setupBottomNav()
        goTo(R.id.chipHotels, ActivityHotels::class.java)
        goTo(R.id.chipBeaches, ActivityBeaches::class.java)
        goTo(R.id.chipRestaurants, ActivityRestaurants::class.java)
        goTo(R.id.chipEntertainment, ActivityEntertainment::class.java)
    }
}