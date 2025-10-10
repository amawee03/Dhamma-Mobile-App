package com.example.dhamma

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dhamma.JatakaActivity
import com.example.dhamma.MainActivity
import com.example.dhamma.PirithActivity
import com.example.dhamma.R

class ProfileActivity : AppCompatActivity() {


    private lateinit var navHome: LinearLayout
    private lateinit var navJataka: LinearLayout
    private lateinit var navPirith: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//

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
}