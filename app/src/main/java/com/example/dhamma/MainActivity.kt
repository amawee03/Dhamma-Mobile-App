package com.example.dhamma

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goHome(view: android.view.View) {
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun goJataka(view: android.view.View) {
        startActivity(Intent(this, JatakaActivity::class.java))
    }

    fun goPirith(view: android.view.View) {
        startActivity(Intent(this, PirithActivity::class.java))
    }

    fun goProfile(view: android.view.View) {
        startActivity(Intent(this, ProfileActivity::class.java))
    }
}
