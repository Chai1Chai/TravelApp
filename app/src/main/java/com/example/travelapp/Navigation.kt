package com.example.travelapp

import android.app.Activity
import android.content.Intent
import android.view.View

// Нажатие на элемент с данным id открывает экран target
fun Activity.goTo(id: Int, target: Class<*>) {
    findViewById<View>(id)?.setOnClickListener {
        startActivity(Intent(this, target))
    }
}

// Кнопка «назад» (стрелка) закрывает экран
fun Activity.setupBack() {
    findViewById<View>(R.id.btnBack)?.setOnClickListener { finish() }
}

// Нижнее меню: работает на всех экранах, где оно подключено
fun Activity.setupBottomNav() {
    navTo(R.id.navHome, MainActivity::class.java)
    navTo(R.id.navMap, CitiesActivity::class.java)
    navTo(R.id.navPlan, ActivityPlanning1::class.java)
    navTo(R.id.navSaved, ActivitySaved::class.java)
    navTo(R.id.navProfile, ActivityProfile::class.java)
}

private fun Activity.navTo(id: Int, target: Class<*>) {
    findViewById<View>(id)?.setOnClickListener {
        val intent = Intent(this, target)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
    }
}