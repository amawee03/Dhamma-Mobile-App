package com.example.dhamma

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class JatakaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jataka)
    }


    fun goHome(view: View) {

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    fun goJataka(view: View) {
        val scrollView = findViewById<android.widget.ScrollView>(R.id.main_scroll)
        scrollView?.smoothScrollTo(0, 0)
    }

    fun goPirith(view: View) {
        startActivity(Intent(this, PirithActivity::class.java))
        finish()
    }

    fun goProfile(view: View) {
        startActivity(Intent(this, ProfileActivity::class.java))
        finish()
    }
}
