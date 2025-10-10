package com.example.dhamma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnSignupComplete = findViewById<Button>(R.id.btnSignup)
        val tvBack = findViewById<TextView>(R.id.tvBack)
        val login = findViewById<TextView>(R.id.tvLogin)

        btnSignupComplete.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        tvBack.setOnClickListener {
            val intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
            finish()
        }

        login.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
