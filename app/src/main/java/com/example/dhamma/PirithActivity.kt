package com.example.dhamma

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PirithActivity : AppCompatActivity() {

    private lateinit var etSearch: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pirith)

        etSearch = findViewById(R.id.etSearch)

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